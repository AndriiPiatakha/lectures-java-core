package patterns.creationalpatterns.builder;

public class BuilderExample {
	public static void main(final String[] args) {
		final ComputerDirector director = new ComputerDirector();
		final ComputerBuilder cheapComputerBuilder = new CheapComputerBuilder();

		director.setComputerBuilder(cheapComputerBuilder);
		Computer computer = director.constructComputer();
//		director.getResult();
		
// ==================================
		
		final Computer computer2 = director.getComputer();
		System.out.println(computer2);
	}
}
