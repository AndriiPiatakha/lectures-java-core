package patterns.chainpatterns.decorator;

public class CarDecorator implements Car {

	private Car car;

	public CarDecorator(Car c) {
		this.car = c;
	}

	@Override
	public void assemble() {
		this.car.assemble();
	}

}
