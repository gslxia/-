package com.bjsxt.pojo;

public class User {
	
	private Integer id;
	private String name;
	private Addr addr;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Addr getAddr() {
		return addr;
	}
	public void setAddr(Addr addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}
	public User(Integer id, String name, Addr addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
