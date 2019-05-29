package com.csc.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CheckVotingEligibility implements InitializingBean, DisposableBean {
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

	public void myDestroy() {
		System.out.println("myDestroy() method");
		name = null;
		age = 0;
		address = null;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() method");
		name = null;
		age = 0;
		address = null;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
		System.out.println("myInit()");
		if (null == name || null == address || age < 18)
			throw new Exception("set proper values to name,address,age bean properties");

	}

}
