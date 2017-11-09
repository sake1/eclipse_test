package id.ac.sgu.inheritance;

public class Driver {

	private static final int CAR_ACCELERATION        = 4;
	private static final int MOTORCYCLE_ACCELERATION = 5;
	private static final int BICYCLE_ACCELERATION    = 2;
	
	public static void main(String[] args) {
		Car car = new Car("Avanza", "Toyota", CAR_ACCELERATION, 1000);
		Motorcycle motor = new Motorcycle("Blade", "Honda", MOTORCYCLE_ACCELERATION, "Black");
		Bicycle bicycle = new Bicycle("Carbon Fiber Bicycle", "SAVA", BICYCLE_ACCELERATION, "MTB Mountain Bike");
		
		car.drive(75);
		motor.drive(55);
		bicycle.drive(31);
		
		car.drive(0);
		motor.drive(0);
		bicycle.drive(0);
	}
}
