package com.springmvc.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class);

		SingletonAppContextBean firstSingletonAppContextBean = context.getBean(SingletonAppContextBean.class);
		PrototypeBean firstPrototype = firstSingletonAppContextBean.getPrototypeBean();

		// get singleton bean instance one more time
		SingletonAppContextBean secondSingletonAppContextBean = context.getBean(SingletonAppContextBean.class);
		PrototypeBean secondPrototype = secondSingletonAppContextBean.getPrototypeBean();

		if (firstPrototype.equals(secondPrototype)) {
			System.out.println("The same instance should be returned");
		} else {
			System.out.println("not same instance");
		}
	}
}
