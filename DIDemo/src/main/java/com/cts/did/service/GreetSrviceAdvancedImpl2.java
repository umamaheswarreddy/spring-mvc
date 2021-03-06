package com.cts.did.service;

public class GreetSrviceAdvancedImpl2 implements GreetService {
	
	private GreetNoteProvider gnp;
	
	
	

	public GreetSrviceAdvancedImpl2(GreetNoteProvider gnp) {
		super();
		this.gnp = gnp;
	}

	public String greet(String username) {
		
		return gnp.getNote()+" "+username;
	}

	public GreetNoteProvider getGnp() {
		return gnp;
	}

	public void setGnp(GreetNoteProvider gnp) {
		this.gnp = gnp;
	}

	public GreetSrviceAdvancedImpl2() {
		super();
	}
	
	
	
	


	




}
