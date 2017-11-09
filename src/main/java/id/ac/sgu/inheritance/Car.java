package id.ac.sgu.inheritance;

public class Car extends Vehicle {

	private int horsePower;
	
	public Car(String name, String brand, int acceleration, int horsePower) {
		super(name, brand, acceleration);
		this.horsePower = horsePower;
	}
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	@Override
	public String toString() {
		return super.getBrand() + " " + super.getName() + " with " + this.getHorsePower() + " horse power, Velocity: " + super.getSpeed();
	}
}
