package patterns.chainpatterns.decorator;

public class DecoratorPatternTest {

	public static void main(final String[] args) {
		final Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");

		final Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
		System.out.println("\n*****");
		
		final Car car = new BasicCar();
		car.assemble();
	}

}
