package com.csc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.csc.beans.CheckVotingEligibility;

public class TestBeanLifeCycle {
	public static void main(String[] args) {
		ApplicationContext ctx = null;
		CheckVotingEligibility bean = null;
		ctx = new ClassPathXmlApplicationContext("com/csc/cfgs/applicationContext.xml");
		// get bean
		bean = ctx.getBean("vote", CheckVotingEligibility.class);
		System.out.println(bean.checkVotingEligibility());
		((AbstractApplicationContext) ctx).close();
	}
}
