package com.cts.abcd.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("gnp2")
//@Primary
public class GreetNoteProviderSimpleImpl implements GreetNoteProvider {

	public String getNote() {
		
		return "Helllo";
	}
	
	

}