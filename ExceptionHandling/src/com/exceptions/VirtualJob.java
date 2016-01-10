package com.exceptions;
public class VirtualJob {
	static final String tooOld="Sorry. You are too old for the job. \nNot registered";
	static final String tooYoung="Sorry. You are too young for the job. \nNot registered";
	
	public void applyJob(Person p)throws TooYoungException,TooOldException {
		try{
			if (p.age<22) throw new TooYoungException();
			else if (p.age>35) throw new TooOldException();			
			else System.out.println("Registration successful.");
			}
		
		catch(TooYoungException y){
			System.out.println(tooYoung);
		}
		catch(TooOldException o){
			System.out.println(tooOld);
		}		
	}
}

