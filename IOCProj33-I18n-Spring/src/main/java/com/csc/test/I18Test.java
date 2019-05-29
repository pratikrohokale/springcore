package com.csc.test;

import java.awt.FlowLayout;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class I18Test {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		Locale locale, locale1 = null;
		JFrame jframe = null;
		JButton btn1 = null, btn2 = null, btn3 = null, btn4 = null;
		String s1 = null, s2 = null, s3 = null, s4 = null;
		
		ctx = new ClassPathXmlApplicationContext("com/csc/cfgs/applicationContext.xml");

		// prepare locale language,country
		locale = new Locale("hi", "IN");
		locale1 = new Locale("", "");
		// get messages
		s1 = ctx.getMessage("label1", new String[] { "me" }, "insert-d", locale);
		s2 = ctx.getMessage("label2", null, "update-d", locale);
		s3 = ctx.getMessage("label3", null, "delete-d", locale1);
		s4 = ctx.getMessage("label4", null, "view-d", locale1);

		// locate Properties file based given Locale

		// create JFreame
		jframe = new JFrame("I18nApp");
		// create buttons
		btn1 = new JButton(s1);
		btn2 = new JButton(s2);
		btn3 = new JButton(s3);
		btn4 = new JButton(s4);

		// add buttons to frame
		jframe.add(btn1);
		jframe.add(btn2);
		jframe.add(btn3);
		jframe.add(btn4);
		jframe.setLayout(new FlowLayout());
		// speify size
		jframe.pack();
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		((AbstractApplicationContext) ctx).close();
	}

}
