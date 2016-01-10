package com.exceptions;

public class Employee {
	private String empName;
	private int empId;
	private int age;
	
	//Employee(String empName, int empId, int age) {
		//this.age=age;
		
	//}
	public int getAge(){
		return age;
	}
	public int getEmpId(){
		return empId;
	}
	public String getEmpName(){
		return empName;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setEmpId(int empId){
		this.empId=empId;
	}
	public void setEmpName(String empName){
		this.empName=empName;
	}
	

}
