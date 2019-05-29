package com.csc.test;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.csc.controller.StudentController;

public class TestLayeredApp {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		BeanDefinitionReader reader = null;
		StudentController controller = null;
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new ClassPathResource("com/csc/cfgs/applicationContext.xml"));
		// get bean;
		controller = factory.getBean("studentController", StudentController.class);
		try {
			controller.processStudent("101", "Pratik", "40", "50", "60");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
