package FactoryPattern;

public class Car extends Vehicle{
	String name="car";
	String type="4";
	public String getCommercialName() {
		return "C "+name+" "+type;
	}
}
