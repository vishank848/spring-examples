package com.scopedProxy.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springmvc.test.MainClass;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		MainClass.getMainClass();
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		SingletonBean firstSingletonBean = applicationContext.getBean(SingletonBean.class);
		PrototypeBean firstPrototype = firstSingletonBean.getPrototypeBean();

		// get singleton bean instance one more time
		SingletonBean secondSingletonBean = applicationContext.getBean(SingletonBean.class);
		PrototypeBean secondPrototype = secondSingletonBean.getPrototypeBean();

		if (firstPrototype.equals(secondPrototype)) {
			System.out.println("The same instance should be returned");
		} else {
			System.out.println("not same instance");
		}
	}
}
