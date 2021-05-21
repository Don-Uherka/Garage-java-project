package cars.garage;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Garage> garage = new ArrayList<>();
		
		Car car = new Car("model", "2020", true, 2);
		Car car2 = new Car("camaro", "2021", false, 2);
		Motorcycle motorcycle = new Motorcycle("Honda", "2016", true, 600, 2);
		Motorcycle motorcycle2 = new Motorcycle("Harley", "2016", true, 600, 3);
		garage.add(car);
		garage.add(car2);
		garage.add(motorcycle);
		garage.add(motorcycle2);
		System.out.println(garage);

	}

}
