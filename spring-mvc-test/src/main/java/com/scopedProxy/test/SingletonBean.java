package com.scopedProxy.test;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

	public SingletonBean() {
		System.out.println("SingletonBean instance created");
	}

	public PrototypeBean getPrototypeBean() {
		return new PrototypeBean();
	}

}
