package com.objectFactory.test;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
@ComponentScan("com.baeldung.sample")
public class AppConfig {

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
	public PrototypeBean prototypeBean() {
		return new PrototypeBean();
	}

	@Bean
	public SingletonObjectFactoryBean singletonBean() {
		return new SingletonObjectFactoryBean();
	}
}
