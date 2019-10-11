package com.springmvc.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		MainClass.getMainClass();
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				AppConfig4.class);

		SingletonProviderBean firstSingletonProviderBean = applicationContext.getBean(SingletonProviderBean.class);
		PrototypeBean firstPrototype = firstSingletonProviderBean.getPrototypeInstance();

		// get singleton bean instance one more time
		SingletonProviderBean secondSingletonProviderBean = applicationContext.getBean(SingletonProviderBean.class);
		PrototypeBean secondPrototype = secondSingletonProviderBean.getPrototypeInstance();

		if (firstPrototype.equals(secondPrototype)) {
			System.out.println("The same instance should be returned");
		} else {
			System.out.println("not same instance");
		}
	}
}
