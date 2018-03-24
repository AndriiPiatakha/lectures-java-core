package oop;

import java.util.Arrays;

public class Lesson7 {
	
	public static void main(String[] args) {
		Integer[] arr = {1, 2, 3};
		
		Integer[] array = Arrays.stream(arr).sorted((a, b) -> a - b).toArray(Integer[]::new);
		
		Sweet[] sweets = {new Sweet()};
		
		Sweet[] array2 = Arrays.stream(sweets).sorted( (sweet1, sweet2) -> {
			return sweet1.getSugar() - sweet2.getSugar();
		}).toArray(Sweet[]::new);
		
		Sweet[] array3 = Arrays.stream(sweets).sorted( (sweet1, sweet2) -> {
			return sweet1.getSugar() - sweet2.getSugar();
		}).toArray(Sweet[]::new);
	
		A a = () -> {
			return 1;
		};
		
		A a4 = () -> 1;
		
		a.smth();
		
		A a2 = new A() {
			@Override
			public int smth() {
				return 1;
			}
		};
		
		System.out.println(a2 instanceof A);
		
		A a3 = new AImpl();
		
		
//		a.smth3();
		
		A.smth3();
		
		
		Object obj = new Object();
		System.out.println(obj.hashCode());

	}

}

class AImpl implements A {

	@Override
	public int smth() {
		return 0;
	}
	
	@Override
	public void smth2() {
		
	}
	
//	@Override
//	public static void smt3() {
//		
//	}
	
}

class AbstrImpl extends AbstrCl {

	
	@Override
	public void smthAbstr() {
		// TODO Auto-generated method stub
		
	}
	
	
}

abstract class AbstrCl {
	protected abstract void smthAbstr();
}

@FunctionalInterface
interface A {
	
	public static final int SOME_STATE = 1;
	int SOME_STATE2 = 1;
	
	public abstract int smth();
	
	default void smth2() {
		
	}
	
	static void smth3() {
		
	}
}

interface ErrorMessages {
	String ERROR1 = "";
}

class Sweet {
	
	private int sugarRange;
	private String name;
	private static int sweetCounts;
	
	{
		++sweetCounts;
	}
	
	public int getSugar() {
		return 1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sugarRange;
		return result;
	}

	
//	a = a;
//	a = b; b = a;
//	a = b; b = c; a = c;
//	if a = null and smth else is obj then always false
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		
		Sweet other = (Sweet) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sugarRange != other.sugarRange)
			return false;
		return true;
	}
	
	
//	@Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Test test = (Test) o;
//        return a == test.a &&
//                Objects.equals(name, test.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(a, name);
//    }

	
	
	
}
