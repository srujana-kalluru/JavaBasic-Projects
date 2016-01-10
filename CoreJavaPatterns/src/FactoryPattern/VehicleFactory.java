package FactoryPattern;

public class VehicleFactory {
	public VehicleFactory(String type) {
	}

	public Vehicle getVehicle(String type) {
		if (type.equalsIgnoreCase("Car"))
			return new Car();
		else if (type.equalsIgnoreCase("Bus"))
			return new Bus();
		else return null;
	}
}
