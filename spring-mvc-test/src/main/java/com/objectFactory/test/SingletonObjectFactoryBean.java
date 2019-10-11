package com.objectFactory.test;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class SingletonObjectFactoryBean {

	@Autowired
	private ObjectFactory<PrototypeBean> prototypeBeanObjectFactory;

	public SingletonObjectFactoryBean() {
		System.out.println("SingletonObjectFactoryBean instance created");
	}

	public PrototypeBean getPrototypeInstance() {
		return prototypeBeanObjectFactory.getObject();
	}

}
