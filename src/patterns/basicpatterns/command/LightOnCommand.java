package patterns.basicpatterns.command;

//Concrete Command

public class LightOnCommand implements Command {

	// reference to the light

	private Light light;

	public LightOnCommand(Light light) {

		this.light = light;

	}

	public void execute() {
		light.switchOn();
	}

}
