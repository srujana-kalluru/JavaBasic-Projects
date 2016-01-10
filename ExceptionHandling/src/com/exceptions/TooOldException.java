package com.exceptions;

@SuppressWarnings("serial")
public class TooOldException extends AgeException {	
	TooOldException(){
		super();
		System.out.println("Type:Too Old");
	}

}
