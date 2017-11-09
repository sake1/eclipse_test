package id.ac.sgu.inheritance;

public class Bicycle extends Vehicle {
	
	private String model;

	public Bicycle(String name, String brand, int acceleration, String model) {
		super(name, brand, acceleration);
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return super.getBrand() + " " + super.getName() + " model " + this.getModel() + " Velocity: " + super.getSpeed();
	}
}
