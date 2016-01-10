package FactoryPattern;

public class Bus extends Vehicle{
	String name="bus";
	String type="4";
	public String getCommercialName() {
		return "B "+name+" "+type;
	}
}
