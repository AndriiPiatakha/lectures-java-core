package patterns.creationalpatterns.abstractfactory.windowfactory;

//ConcreteFactory1

public class MsWindowsWidgetFactory implements AbstractWidgetFactory {

	// create an MSWindow

	public Window createWindow() {

		final MSWindow window = new MSWindow();

		return window;

	}

}
