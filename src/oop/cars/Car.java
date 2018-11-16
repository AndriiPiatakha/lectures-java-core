package oop.cars;

public class Car {
	private Engine engine;
	protected int i;
	
	public Engine getEngine() {
		return this.engine;
	}
	
	public void setEngine(Engine engine) {
		// validate engine
		this.engine = engine;
	}
}
