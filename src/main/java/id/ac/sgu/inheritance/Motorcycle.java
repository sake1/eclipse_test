package id.ac.sgu.inheritance;

public class Motorcycle extends Vehicle {
	
	private String Color;

	public Motorcycle(String name, String brand, int acceleration, String color) {
		super(name, brand, acceleration);
		Color = color;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	@Override
	public String toString() {
		return this.getColor() + " " + super.getBrand() + " " + super.getName() + " Velocity: " + super.getSpeed();
	}
}
