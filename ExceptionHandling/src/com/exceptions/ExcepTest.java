package com.exceptions;
public class ExcepTest {
	public static void main(String[] args) {
		try{
			int a[]=new int[2];
			System.out.println(a[9]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			 System.out.println("Exception Occured : "+e);
		}
		System.out.println("out of the block");
	}

}
