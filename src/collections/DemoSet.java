package collections;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {

	public static void main(String[] args) {
		Set<TestClass> set = new HashSet<>();
		TestClass e = new TestClass(1);
		TestClass e2 = new TestClass(1);
		System.out.println(set.add(e));
		System.out.println(set.add(e));
		System.out.println(set.add(e2));
		System.out.println(set.size());
	}
}


class TestClass {
	
	private int i;
	
	public TestClass(int i) {
		this.i = i;
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
		TestClass other = (TestClass) obj;
		if (i != other.i)
			return false;
		return true;
	}
}