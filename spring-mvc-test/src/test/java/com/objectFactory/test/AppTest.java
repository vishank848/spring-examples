package com.objectFactory.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class AppTest {

	@Test
	@SuppressWarnings("resource")
	public void givenPrototypeInjection_WhenObjectFactory_ThenNewInstanceReturn() {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		SingletonObjectFactoryBean firstContext = context.getBean(SingletonObjectFactoryBean.class);

		SingletonObjectFactoryBean secondContext = context.getBean(SingletonObjectFactoryBean.class);

		PrototypeBean firstInstance = firstContext.getPrototypeInstance();
		PrototypeBean secondInstance = secondContext.getPrototypeInstance();

		assertTrue("New instance expected", firstInstance != secondInstance);
	}

}
