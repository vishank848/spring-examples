package com.springmvc.test;

import javax.inject.Provider;

import org.springframework.beans.factory.annotation.Autowired;

public class SingletonProviderBean {

	@Autowired
	private Provider<PrototypeBean> myPrototypeBeanProvider;

	public SingletonProviderBean() {
		System.out.println("SingletonProviderBean instance created");
	}

	public PrototypeBean getPrototypeInstance() {
		return myPrototypeBeanProvider.get();
	}

}
