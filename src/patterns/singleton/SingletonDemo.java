package patterns.singleton;

// thread unsafe 
// EJB
public class SingletonDemo {
	
	private static SingletonDemo instance;
	
	private SingletonDemo() {
	}

	public SingletonDemo getInstance() {
		if (instance == null) {
			instance = new SingletonDemo();
		}
		return instance;
	}
}
