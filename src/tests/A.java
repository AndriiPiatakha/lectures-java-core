package tests;

public class A {

	private int i;
	
	public A() {
		i = 10;
	}
	
	public static void main(String[] args) {
		int i = 9;
		A a = new A();
		while (a.i < 10) {
			a.doIt();
		}
		
		System.out.println(a.hashCode());
	}

	private static void doIt() {
//		i++;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		if (i != other.i)
			return false;
		return true;
	}
	
}
