package com.cts.did.ui;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.did.service.GreetService;
import com.cts.did.service.GreetServiveSimpleImpl;
import com.cts.did.service.GreetSrviceAdvancedImpl2;
import com.cts.did.service.GreetSrviceEnhancedImpl;

public class DidApp2 {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans2.xml");
		
	
		
		
		GreetSrviceEnhancedImpl gs2=(GreetSrviceEnhancedImpl) context.getBean("g2");
		
		gs2.setGreeting("vanakkam");
		System.out.println(gs2.greet(" mahesh"));
		

		GreetSrviceEnhancedImpl gs3=(GreetSrviceEnhancedImpl) context.getBean("g2");
		System.out.println(gs3.greet(" mahesh"));
		
		GreetService gs4=(GreetService) context.getBean("g3");
		System.out.println(gs4.greet(" mahesh"));
		
		
	}

}
