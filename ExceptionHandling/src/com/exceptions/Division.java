package com.exceptions;
import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two integers");
		int val1=sc.nextInt();
		int val2=sc.nextInt();
		try{
			double div=division(val1,val2);
			System.out.println("The result of division is:"+div);
		}
		catch(ArithmeticException a){
			System.out.println(a+"\nDivide by zero not possible");
		} finally {
			sc.close();
		}
	}
	public static double division(int val1, int val2) {
		if (val2==0)
			throw new ArithmeticException();
		else return (double)val1/val2;		
	}

}
