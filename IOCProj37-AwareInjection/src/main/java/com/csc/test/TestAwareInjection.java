package com.csc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.csc.beans.Crickter;

public class TestAwareInjection {
	public static void main(String[] args) {
		ApplicationContext ctx = null;
		Crickter playCrickter = null;
		ctx = new ClassPathXmlApplicationContext("com/csc/cfgs/applicationContext.xml");
		// get bean
		playCrickter = ctx.getBean("player", Crickter.class);
		playCrickter.batting();
		playCrickter.bowling();
		playCrickter.fielding();
		((AbstractApplicationContext) ctx).close();
	}
}
