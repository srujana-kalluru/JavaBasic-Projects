package com.exceptions;

import java.util.Scanner;

public class VirtualCompany {

	public static void main(String[] args) throws TooYoungException,
			TooOldException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name and Age");
		String name = sc.nextLine();
		int age = sc.nextInt();

		Person p = new Person();
		p.setAge(age);
		p.setName(name);

		VirtualJob v = new VirtualJob();
		v.applyJob(p);
		fillJob(v, p);
		sc.close();
	}

	public static void fillJob(VirtualJob v, Person p) {
		System.out.println("The details entered are:\nName:" + p.getName()
				+ "\nAge:" + p.getAge());
	}

}
