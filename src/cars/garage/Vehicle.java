package cars.garage;

public class Vehicle extends Garage {
	//Attributes
	private String model;
	protected String year;
	public boolean isON;
	
	
	
	//Constructor
	public Vehicle(String model, String year, boolean isOn) {
		this.model = model;
		this.year = year;
		this.isON = isOn;
	}
	
	//Methods
	public boolean turnON(boolean isOn) {
		return isOn = true;
	}
	
	public boolean turnOff(boolean isOn) {
		return isOn = false;
	}
	
	
	
	
	public String getModel() {
		return model;
	}
	
	public String getYear() {
		return year;
	}

}
