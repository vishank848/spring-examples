package com.function.test;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.baeldung.sample")
public class AppConfig {

	@Bean
	public Function<String, PrototypeBean> beanFactory() {
		return name -> prototypeBeanWithParam(name);
	}

	@Bean
	@Scope(value = "prototype")
	public PrototypeBean prototypeBeanWithParam(String name) {
		return new PrototypeBean(name);
	}

	@Bean
	public SingletonFunctionBean singletonFunctionBean() {
		return new SingletonFunctionBean();
	}
}
