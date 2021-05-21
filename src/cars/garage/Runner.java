package cars.garage;


public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car car = new Car("model", "2020", true, 2);
		Car car2 = new Car("camaro", "2021", false, 2);
		Motorcycle motorcycle = new Motorcycle("Honda", "2016", true, 600, 2);
		Motorcycle motorcycle2 = new Motorcycle("Harley", "2016", true, 600, 3);
		Garage garage = new Garage();
		garage.addVehicles(car);
		garage.addVehicles(car2);
		garage.addVehicles(motorcycle2);
		garage.addVehicles(motorcycle);
		System.out.println(garage);

	}

}
