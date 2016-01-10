package com.exceptions;

@SuppressWarnings("serial")
public class TooYoungException extends AgeException {	
	TooYoungException(){
		super();
		System.out.println("Type:Too Young");
	}

}
