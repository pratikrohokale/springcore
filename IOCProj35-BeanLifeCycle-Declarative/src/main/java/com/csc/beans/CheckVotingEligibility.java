package com.csc.beans;

public class CheckVotingEligibility {
	private int age;
	private String name;
	private String address;

	public CheckVotingEligibility() {
		System.out.println("0-param constructor");
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void myInit() throws Exception {
		System.out.println("myInit()");
		if (null == name || null == address || age < 18)
			throw new Exception("set proper values to name,address,age bean properties");
	}

	public String checkVotingEligibility() {
		if (age < 18)
			return " Mr/Miss" + name + " u r not elgible to vote";
		else
			return " Mr/Miss" + name + " u r  elgible to vote";
	}

	public void destroy() {
		System.out.println("destroy() method");
		name = null;
		age = 0;
		address = null;
	}

}
