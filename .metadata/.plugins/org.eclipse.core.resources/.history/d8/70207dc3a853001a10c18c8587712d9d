package com.cts.did.ui;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.did.service.GreetService;
import com.cts.did.service.GreetServiveSimpleImpl;

public class DidApp01 {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans1.xml");
		
		GreetService gs=(GreetService) context.getBean("g1");
		System.out.println(gs.greet(" mahesh"));
		
		
		
		GreetService gs2=(GreetService) context.getBean("g2");
		System.out.println(gs2.greet(" mahesh"));
		
	}

}
