package com.cts.did.service;

public class GreetSrviceEnhancedImpl implements GreetService {
	
	private String greeting;
	
	
	public GreetSrviceEnhancedImpl(String greeting) {
		super();
		this.greeting = greeting;
	}



	public GreetSrviceEnhancedImpl() {
		super();
	}



	public String greet(String username) {
		
		return greeting+" "+username;
	}



	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}


}
