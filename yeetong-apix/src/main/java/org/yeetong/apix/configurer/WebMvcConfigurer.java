package org.yeetong.apix.configurer;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * Spring MVC 配置
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {

	private final Logger logger = LoggerFactory.getLogger(WebMvcConfigurer.class);

	// 使用阿里 FastJson 作为JSON MessageConverter
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
		FastJsonConfig config = new FastJsonConfig();
		config.setSerializerFeatures(SerializerFeature.WriteMapNullValue);// 保留空的字段
		// SerializerFeature.WriteNullStringAsEmpty,//String null -> ""
		// SerializerFeature.WriteNullNumberAsZero//Number null -> 0
		// 按需配置，更多参考FastJson文档哈
		converter.setFastJsonConfig(config);
		converter.setDefaultCharset(Charset.forName("UTF-8"));
		converter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON_UTF8));
		converters.add(converter);
	}

	// 统一异常处理
	@Override
	public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {
		exceptionResolvers.add(new HandlerExceptionResolver() {
			public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e) {
				logger.info("request ip=" + getIpAddress(request));
				response.setCharacterEncoding("UTF-8");
				response.setHeader("Content-type", "application/json;charset=UTF-8");
				response.setStatus(200);
				try {
					response.getWriter().write("fail");
				} catch (IOException ex) {
					logger.error(ex.getMessage());
				}
				return new ModelAndView();
			}

		});
	}

	// 解决跨域问题
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*").allowedMethods("*").allowedHeaders("*").allowCredentials(true).exposedHeaders(HttpHeaders.SET_COOKIE).maxAge(3600L);
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		super.addInterceptors(registry);
	}

	@Bean(name = "threadPoolTaskExecutor")
	public Executor threadPoolTaskExecutor() {
		return new ThreadPoolTaskExecutor();
	}

	private String getIpAddress(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_CLIENT_IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		// 如果是多级代理，那么取第一个ip为客户端ip
		if (ip != null && ip.indexOf(",") != -1) {
			ip = ip.substring(0, ip.indexOf(",")).trim();
		}

		return ip;
	}

	public void MethodArgumentNotValidException(Exception ex, HttpServletRequest request, HttpServletResponse response) {
		MethodArgumentNotValidException c = (MethodArgumentNotValidException) ex;
		List<ObjectError> errors = c.getBindingResult().getAllErrors();
		StringBuffer errorMsg = new StringBuffer();
		errors.stream().forEach(x -> errorMsg.append(x.getDefaultMessage()).append(";"));
		pouplateExceptionResponse(response, HttpStatus.INTERNAL_SERVER_ERROR, errorMsg.toString());
	}

	private void pouplateExceptionResponse(HttpServletResponse response, HttpStatus errorCode, String errorMessage) {
		try {
			response.sendError(errorCode.value(), errorMessage);
		} catch (IOException e) {
			logger.error("failed to populate response error", e);
		}
	}
}
