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

}
