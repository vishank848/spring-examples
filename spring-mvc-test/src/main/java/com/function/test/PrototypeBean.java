package com.function.test;

public class PrototypeBean {

	private String name;

	public PrototypeBean(String name) {
		this.setName(name);
		System.out.println("Prototype instance " + name + " created");
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
