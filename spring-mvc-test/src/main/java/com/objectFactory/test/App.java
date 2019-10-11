package com.objectFactory.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springmvc.test.MainClass;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		MainClass.getMainClass();
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		SingletonObjectFactoryBean firstSingletonObjectFactoryBean = applicationContext
				.getBean(SingletonObjectFactoryBean.class);

		// get singleton bean instance one more time
		SingletonObjectFactoryBean secondSingletonObjectFactoryBean = applicationContext
				.getBean(SingletonObjectFactoryBean.class);
		
		PrototypeBean firstPrototype = firstSingletonObjectFactoryBean.getPrototypeInstance();
		PrototypeBean secondPrototype = secondSingletonObjectFactoryBean.getPrototypeInstance();

		if (firstPrototype.equals(secondPrototype)) {
			System.out.println("The same instance was returned");
		} else {
			System.out.println("not the same instance");
		}
	}
}
