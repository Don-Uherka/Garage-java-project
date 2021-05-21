package cars.garage;

public class Truck extends Vehicle{
	//Attributes
	public int weight;
	public int bedLength;
	
	//Constructor
	public Truck(String model, String year, boolean isOn, int weight, int bedLength, int licensePlate) {
		super(model, year, isOn, licensePlate);
		this.weight = weight;
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

	@Override
	public String toString() {
		String t = "CAR INSTANCE DETAILS: \n";
		t += "TRUCK MODEL       : " + this.model + "\n";
		t += "YEAR              : " + this.year + "\n";
		t += "WEIGHT            : " + this.weight + "\n";
		t += "BED LENGTH        : " + this.bedLength + "\n";
		t += "LECENSE PLATE     : " + this.licensePlate + "\n";
		return t;
	}
	
	

}
