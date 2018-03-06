package patterns.creationalpatterns.abstractfactory.windowfactory;

//Client

public class GUIBuilder {

	public void buildWindow(AbstractWidgetFactory widgetFactory) {

		Window window = widgetFactory.createWindow();
		window.setTitle("New Window");
		
		// button widgetFactory.createButton();

	}

}
