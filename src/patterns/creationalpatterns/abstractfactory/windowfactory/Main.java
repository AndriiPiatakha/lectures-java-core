package patterns.creationalpatterns.abstractfactory.windowfactory;

public class Main {

	public static void main(final String[] args) {
		final GUIBuilder builder = new GUIBuilder();

		AbstractWidgetFactory widgetFactory = null;

		// check what platform we're on
		final String platform = "MACOSX";
		if (platform.equals("MACOSX")) {

			widgetFactory = new MacOSXWidgetFactory();

		} else {
			widgetFactory = new MsWindowsWidgetFactory();
		}
		
		builder.buildWindow(widgetFactory);
	}
}
