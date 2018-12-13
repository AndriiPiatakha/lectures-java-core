package lessons.allgroups;

public class GiftExample {
	String someProperty;
	
	protected String getter() {
		return "";
	}
	
	GiftExample() {
		
	}
	
	public static void main(String[] args) {
		
		GiftExample ge = new ExampleChild();
		ge.getter();
	}

}

class ExampleChild extends GiftExample {
	
	@Override
	public String getter() {
		return "";
	}
}
