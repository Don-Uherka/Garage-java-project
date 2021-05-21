package cars.garage;

public class Car extends Vehicle {
	//Attributes
	private int numOfDoors;
	private int numOfHP;
	
	
	
    //Constructor
	public Car(String model, String year, boolean isOn, int numOfDoors) {
		super(model, year, isOn);
		this.numOfDoors = numOfDoors;
		
		
	}
	
	
	//Methods
	public int getNumOfDoors() {
		return numOfDoors;
	}
	
	public int getNumOfHP() {
		return numOfHP;
	}
	
	public int setNumOfHP(int newNumHP) {
		return this.numOfHP = newNumHP;
	}
	
	public void Accelerate() {
		System.out.println("The car begins to move forward");
	}
	
	public void Brake() {
		System.out.println("The car comes to a stop");
	}


	@Override
	public String toString() {
		String c = "CAR INSTANCE DETAILS: \n";
		c += "CAR MODEL      : \n";
		c += "YEAR           : " + this.year + "\n";
		c += "NUMBER OF DOORS: " + this.numOfDoors + "\n";
		return c;
	}
	
	

}
