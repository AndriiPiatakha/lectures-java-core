package lessons.group2;

@FunctionalInterface
public interface FunctionalInterfaceTest {
	
	void doSmth();
	
	default void doSmth2() {
		
	}

	static void doSmth3() {
		
	}
}
