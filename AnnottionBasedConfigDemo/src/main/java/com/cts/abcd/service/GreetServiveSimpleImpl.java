package com.cts.abcd.service;

import org.springframework.stereotype.Component;

@Component("g1")
public class GreetServiveSimpleImpl implements GreetService {

	public String greet(String username) {
			
		return "hello"+username;
	}

}
