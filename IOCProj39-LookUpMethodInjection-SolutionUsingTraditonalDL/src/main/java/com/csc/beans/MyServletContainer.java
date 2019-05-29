package com.csc.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyServletContainer {
	private String beanId;

	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public MyServletContainer() {
		System.out.println("MyServletContainer:0-param  constructor");
	}

	@SuppressWarnings("resource")
	public void handleRequest(String data) {
		ApplicationContext ctx = null;
		RequestHandler handler = null;
		ctx = new ClassPathXmlApplicationContext("com/csc/cfgs/applicationContext.xml");
		handler = ctx.getBean(beanId, RequestHandler.class);
		System.out.println("MyServletCotainer is ready to handle the request");
		handler.processing(data);

	}
}
