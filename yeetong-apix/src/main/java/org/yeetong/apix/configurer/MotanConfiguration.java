package org.yeetong.apix.configurer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.weibo.api.motan.config.springsupport.AnnotationBean;
import com.weibo.api.motan.config.springsupport.BasicRefererConfigBean;
import com.weibo.api.motan.config.springsupport.ProtocolConfigBean;
import com.weibo.api.motan.config.springsupport.RegistryConfigBean;

@Configuration
public class MotanConfiguration {

	@Bean
	public AnnotationBean motanAnnotationBean() {
		AnnotationBean motanAnnotationBean = new AnnotationBean();
		motanAnnotationBean.setPackage("org.yeetong.apix.api");
		return motanAnnotationBean;
	}

	@Bean(name = "motan")
	public ProtocolConfigBean protocolConfig() {
		ProtocolConfigBean config = new ProtocolConfigBean();
		config.setDefault(true);
		config.setName("motan");
		config.setMaxContentLength(1048576);
		return config;
	}

	@Bean(name = "registry")
	public RegistryConfigBean registryConfig() {
		RegistryConfigBean config = new RegistryConfigBean();
		config.setBeanName("registry");
		config.setRegProtocol("zookeeper");
		config.setAddress("192.168.1.105:2181");
		config.setConnectTimeout(2000);
		return config;
	}

	@Bean(name = "motantestClientBasicConfig")
	public BasicRefererConfigBean baseRefererConfig() {
		BasicRefererConfigBean config = new BasicRefererConfigBean();
		config.setProtocol("motan");
		config.setLocalServiceAddress("127.0.0.1:8002");
		config.setGroup("yeetong");
		config.setModule("rpc");
		config.setApplication("yeetong");
		config.setRegistry("registry");
		config.setCheck(false);
		config.setAccessLog(true);
		config.setRequestTimeout(5000);
		config.setRetries(2);
		config.setThrowException(true);
		return config;
	}
}
