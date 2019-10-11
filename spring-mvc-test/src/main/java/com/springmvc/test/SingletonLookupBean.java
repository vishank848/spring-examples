package com.springmvc.test;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class SingletonLookupBean {

	public SingletonLookupBean() {
		System.out.println("SingletonLookupBean instance created");
	}

	@Lookup
	public PrototypeBean getPrototypeBean() {
		return new PrototypeBean();
	}
}
