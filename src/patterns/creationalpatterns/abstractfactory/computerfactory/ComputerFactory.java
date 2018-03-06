package patterns.creationalpatterns.abstractfactory.computerfactory;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}