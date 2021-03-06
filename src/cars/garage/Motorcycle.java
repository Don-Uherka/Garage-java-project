package cars.garage;

public class Motorcycle extends Vehicle {
	//Attributes
	private int power;
	private int numOfWheels;
	
	
	//Constructor
	public Motorcycle(String model, String year, boolean isOn, int power, int numOfWheels, int licensePlate) {
		super(model, year, isOn, licensePlate);
		this.numOfWheels = numOfWheels;
		
	}
	
	//Methods
	public void Accelerate() {
		System.out.println("The motorcycle starts to move");
	}
	
	public void Brake() {
		System.out.println("The motorcycle comes to a stop");
	}
	public int getPower() {
		return power;
	}
	
	public void setPower(int newPower) {
		this.power = newPower;
	}
	
	public int getNumOfWheels() {
		return numOfWheels;
	}

	@Override
	public String toString() {
		String c = "CAR INSTANCE DETAILS: \n";
		c += "MOTORCYCLE MODEL  : " + this.model + "\n";
		c += "YEAR              : " + this.year + "\n";
		c += "NUMBER OF WHEELS  : " + this.numOfWheels + "\n";
		c += "LICENSE PLATE     : " + this.licensePlate + "\n";
		return c;
	}
	
	
	
	
	
	
	}
	
	


