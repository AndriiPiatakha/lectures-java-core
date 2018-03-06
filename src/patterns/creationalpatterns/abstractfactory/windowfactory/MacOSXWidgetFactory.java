package patterns.creationalpatterns.abstractfactory.windowfactory;

//ConcreteFactory2

public class MacOSXWidgetFactory implements AbstractWidgetFactory {

	// create a MacOSXWindow
	
	@Override
	public Window createWindow() {
		final MacOSXWindow window = new MacOSXWindow();
		return window;
	}
	
	// create whatever you need for this widget
}
