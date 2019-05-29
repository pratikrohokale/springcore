package com.csc.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Crickter implements ApplicationContextAware {
	private String beanId;
	private ApplicationContext ctx;

	
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		this.ctx = applicationContext;

	}

	public void fielding() {
		System.out.println("Cricketer is fielding...");
	}

	public void bowling() {
		System.out.println("Cricketer is bowling...");
	}

	public void batting() {
		System.out.println("battting method");
		Bat bat = null;
		bat = ctx.getBean(beanId, Bat.class);
		System.out.println("Crickter is batting...");
		bat.hittingRuns();
	}

}
