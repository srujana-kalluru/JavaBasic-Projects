package FactoryPattern;

import java.util.Scanner;

public class VehicleDemo {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter type");
		String type=sc.next();
		Vehicle v=new VehicleFactory(type).getVehicle(type);
		System.out.println(v.getCommercialName());
		sc.close();
		
	}

}
