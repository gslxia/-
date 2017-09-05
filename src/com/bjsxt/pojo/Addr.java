package com.bjsxt.pojo;

public class Addr {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Addr [name=" + name + "]";
	}

	public Addr(String name) {
		super();
		this.name = name;
	}

	public Addr() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
