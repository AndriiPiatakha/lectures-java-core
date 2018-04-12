package patterns.creationalpatterns.builder;

public class BuilderExample {
	public static void main(final String[] args) {
		final ComputerDirector director = new ComputerDirector();
		final ComputerBuilder cheapComputerBuilder = new CheapComputerBuilder();

		director.setComputerBuilder(cheapComputerBuilder);
		director.constructComputer();

		final Computer computer = director.getComputer();
		System.out.println(computer);
	}
}
