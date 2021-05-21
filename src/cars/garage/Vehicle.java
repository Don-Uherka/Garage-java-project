package cars.garage;

public class Vehicle{
	//Attributes
	protected String model;
	protected String year;
	public boolean isON;
	protected int licensePlate;
	
	
	
	//Constructor
	public Vehicle(String model, String year, boolean isOn, int licensePlate) {
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
	
	public int getLicensePlate() {
		return licensePlate;
	}

}
