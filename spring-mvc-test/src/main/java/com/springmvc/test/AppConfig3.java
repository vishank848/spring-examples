package com.springmvc.test;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.baeldung.sample")
public class AppConfig3 {

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public PrototypeBean prototypeBean() {
		return new PrototypeBean();
	}

	@Bean
	public SingletonLookupBean singletonLookupBean() {
		return new SingletonLookupBean();
	}
}
