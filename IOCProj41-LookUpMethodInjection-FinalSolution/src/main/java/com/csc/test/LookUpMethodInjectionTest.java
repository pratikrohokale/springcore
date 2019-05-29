package com.csc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.csc.beans.MyServletContainer;

public class LookUpMethodInjectionTest {
	public static void main(String[] args) {
		ApplicationContext ctx = null;
		MyServletContainer bean = null;
		ctx = new ClassPathXmlApplicationContext("com/csc/cfgs/applicationContext.xml");
		// get bean
		bean = ctx.getBean("container", MyServletContainer.class);
		bean.handleRequest("hello");
		bean.handleRequest("hi");
		bean.handleRequest("hey");
		((AbstractApplicationContext) ctx).close();
	}
}
