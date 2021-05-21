package cars.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage{
	//Attributes
	List<Vehicle> contents = new ArrayList<>();  
	
	
	
	//Constructor
	
	
	//Methods
	public void addVehicles(Vehicle input) {
		contents.add(input);
	}
	
	public void removeVehicles(Vehicle input) {
		contents.remove(input);
	}
	
	public void removeAllVehicles() {
		contents.removeAll(contents);
	}
	
	public void seeVehicles(contents) {
		for (Vehicle : contents) {
			System.out.println(Vehicle);
		}
	}

}
