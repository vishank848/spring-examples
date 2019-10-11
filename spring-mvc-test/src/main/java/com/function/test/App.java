package com.function.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springmvc.test.MainClass;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		MainClass.getMainClass();
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		SingletonFunctionBean firstSingletonObjectFactoryBean = applicationContext
				.getBean(SingletonFunctionBean.class);
		PrototypeBean firstPrototype = firstSingletonObjectFactoryBean.getPrototypeInstance("ins1");

		// get singleton bean instance one more time
		SingletonFunctionBean secondSingletonObjectFactoryBean = applicationContext
				.getBean(SingletonFunctionBean.class);
		PrototypeBean secondPrototype = secondSingletonObjectFactoryBean.getPrototypeInstance("ins2");

		if (firstPrototype.equals(secondPrototype)) {
			System.out.println("The same instance was returned");
		} else {
			System.out.println("not the same instance");
		}
	}
}
