package com.csc.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.csc.beans.Bank;

public class MethodReplacerInjections {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Bank bank=null;
		float intrAmt=0.0f;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/csc/cfgs/applicationContext.xml");
		//get Bean
		bank=ctx.getBean("bank",Bank.class);
		System.out.println("class name::"+bank.getClass()+"super class"+bank.getClass().getSuperclass()+"methods are"+Arrays.toString(bank.getClass().getMethods()));
		// invoke the mthod
		intrAmt=bank.calcIntrAmt(10000, 20);
		System.out.println("Intrest Amount::"+intrAmt);
		
		System.out.println("-----------------------------------");
		System.out.println("Fixed Term Intr Amount::"+bank.calcIntrAmt(10000));
		
		//close container
		((AbstractApplicationContext) ctx).close();
	}
}
