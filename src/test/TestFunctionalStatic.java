package test;

@FunctionalInterface
public interface TestFunctionalStatic {
	public void b();

	static void s() {
		System.out.println("s");
	}

	default void f() {
		System.out.println("f");
	}
}