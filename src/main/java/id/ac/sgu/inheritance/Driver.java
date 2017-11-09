package id.ac.sgu.inheritance;

public class Driver {

	public static void main(String[] args) {
		Car car = new Car("Avanza", "Toyota", 4, 1000);
		Motorcycle motor = new Motorcycle("Blade", "Honda", 5, "Black");
		Bicycle bicycle = new Bicycle("Carbon Fiber Bicycle", "SAVA", 2, "MTB Mountain Bike");
		
		car.drive(75);
		motor.drive(55);
		bicycle.drive(31);
		
		car.drive(0);
		motor.drive(0);
		bicycle.drive(0);
	}
}
