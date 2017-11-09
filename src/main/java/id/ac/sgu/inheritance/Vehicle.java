package id.ac.sgu.inheritance;

public class Vehicle {
	
	private String name;
	private String brand;
	private int acceleration;
	private int speed;
	
	public Vehicle(String name, String brand, int acceleration) {
		super();
		this.name = name;
		this.brand = brand;
		this.acceleration = acceleration;
		this.speed = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getAcceleration() {
		return acceleration;
	}
	public void setAcceleration(int acceleration) {
		this.acceleration = acceleration;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	@Override
	public String toString() {
		return brand + " " + name + " Velocity:" + speed;
	}

	public void drive(int targetSpeed) {
		System.out.println(this.toString());
		while(speed != targetSpeed) {
			speed += addOrReduce(change(acceleration, speed, targetSpeed), speed, targetSpeed);
			System.out.println(this.toString());
		}
	}

	private int addOrReduce(int value, int speed, int limit) {
		return value * (limit - speed) / Math.abs(limit - speed);
	}
	
	private int change(int acceleration, int speed, int limit) {
		return Math.min(acceleration, Math.abs(limit - speed));
	}
}
