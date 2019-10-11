package com.springmvc.test;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;

public class SingletonBean {

	@Autowired
	private PrototypeBean prototypeBean;

	public SingletonBean() {
		System.out.println("SingletonBean instance created");
	}

	public PrototypeBean getPrototypeBean() {
		System.out.println(String.valueOf(LocalTime.now()));
		return prototypeBean;
	}

}
