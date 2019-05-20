package org.yeetong.rpc.service.configurer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.weibo.api.motan.config.springsupport.AnnotationBean;
import com.weibo.api.motan.config.springsupport.BasicServiceConfigBean;
import com.weibo.api.motan.config.springsupport.ProtocolConfigBean;
import com.weibo.api.motan.config.springsupport.RegistryConfigBean;

@Configuration
public class MotanConfiguration {
	@Bean
	public AnnotationBean motanAnnotationBean() {
		AnnotationBean motanAnnotationBean = new AnnotationBean();
		motanAnnotationBean.setPackage("org.yeetong.rpc.service.api");
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

	@Bean
	public BasicServiceConfigBean baseServiceConfig() {
		BasicServiceConfigBean config = new BasicServiceConfigBean();
		config.setExport("motan:8002");
		config.setGroup("yeetong");
		config.setModule("rpc");
		config.setAccessLog(false);
		config.setShareChannel(true);
		config.setApplication("yeetong");
		config.setRegistry("registry");
		return config;
	}
}
