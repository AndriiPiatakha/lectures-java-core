package patterns.creationalpatterns.builder;

public class ComputerDirector {
	private ComputerBuilder computerBuilder;

	public void setComputerBuilder(final ComputerBuilder computerBuilder) {
		this.computerBuilder = computerBuilder;
	}

	public Computer getComputer() {
		return computerBuilder.getComputer();
	}

	public void constructComputer() {
		computerBuilder.createNewComputer();
		computerBuilder.buildSystemBlock();
		computerBuilder.buildDisplay();
		computerBuilder.buildManipulators();
	}
}
