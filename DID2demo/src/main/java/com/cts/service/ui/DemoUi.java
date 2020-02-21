package com.cts.service.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.cts.service.GreetSerIn;

public class DemoUi {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans2.xml");
		GreetSerIn gs= (GreetSerIn) context.getBean("g2");
		System.out.println(gs.greet("rishab  "));
		
	}

}
