package com.springmvc.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	/*
	 * public static void main(String[] args) { AnnotationConfigApplicationContext
	 * ctx = new AnnotationConfigApplicationContext(AppConfig.class); FooService
	 * fooService = ctx.getBean(FooService.class); fooService.doStuff(); }
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		SingletonBean firstSingleton = context.getBean(SingletonBean.class);
		PrototypeBean firstPrototype = firstSingleton.getPrototypeBean();

		// get singleton bean instance one more time
		SingletonBean secondSingleton = context.getBean(SingletonBean.class);
		PrototypeBean secondPrototype = secondSingleton.getPrototypeBean();

		if (firstPrototype.equals(secondPrototype)) {
			System.out.println("The same instance should be returned");
		} else {
			System.out.println("not same instance");
		}
	}
}
