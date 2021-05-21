package cars.garage;

public class Truck extends Vehicle{
	//Attributes
	public int Weight;
	public int bedLength;
	
	//Constructor
	public Truck(String model, String year, boolean isOn, int weight, int bedLength, int licensePlate) {
		super(model, year, isOn, licensePlate);
		this.Weight = weight;
		this.bedLength = bedLength;
	}
	
	//Methods
	public void Brake() {
		System.out.println("The truck comes to a stop");
	}
	
	public void Accelerate() {
		System.out.println("The truck begins to move forward");
	}
	
	public int getBedLength() {
		return bedLength;
	}
	
	

}
