package com.exceptions;

import java.util.Scanner;

public class EmpRegistration {
	public static void main(String[] args) {
		try {
			addEmployee();
			System.out.println("Registered successfully");
		} catch (AgeMisMatchException amme) {
			System.out.println("Age should be atleast 18");
		}
	}

	public static void addEmployee() throws AgeMisMatchException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name, employee id, age");
		String empName = sc.nextLine();
		int empId = sc.nextInt();
		int age = sc.nextInt();

		if (age < 18) {
			sc.close();
			throw new AgeMisMatchException("Registration failed");
		} else {
			Employee e = new Employee();
			e.setAge(age);
			e.setEmpName(empName);
			e.setEmpId(empId);
		}
		sc.close();
	}
}
