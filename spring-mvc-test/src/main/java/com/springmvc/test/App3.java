package com.springmvc.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		MainClass.getMainClass();
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig3.class);

		SingletonLookupBean firstSingletonLookupBean = applicationContext.getBean(SingletonLookupBean.class);
		PrototypeBean firstPrototype = firstSingletonLookupBean.getPrototypeBean();

		// get singleton bean instance one more time
		SingletonLookupBean secondSingletonLookupBean = applicationContext.getBean(SingletonLookupBean.class);
		PrototypeBean secondPrototype = secondSingletonLookupBean.getPrototypeBean();

		if (firstPrototype.equals(secondPrototype)) {
			System.out.println("The same instance should be returned");
		} else {
			System.out.println("not same instance");
		}
	}
}
