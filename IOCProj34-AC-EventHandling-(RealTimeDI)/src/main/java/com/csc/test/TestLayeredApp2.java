package com.csc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.csc.controller.StudentController;

public class TestLayeredApp2 {

	public static void main(String[] args) {
		ApplicationContext factory = null;
		StudentController controller = null;

		factory = new ClassPathXmlApplicationContext("com/csc/cfgs/applicationContext.xml");
		// get bean;
		controller = factory.getBean("studentController", StudentController.class);
		try {
			controller.processStudent("108", "Vishal", "100", "100", "100");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		((AbstractApplicationContext) factory).close();
	}

}
