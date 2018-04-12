package generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class GenericDemo {
	
	public static void main(String[] args) {
		Z<Parent> z = new Z<>(new Child());
		
		
		
//		List<Integer> listInteger = new ArrayList<>();
//		List list2 = listInteger;
//		List<String> listString = list2;
//		listString.add("asd");
	
		List<Child2> list = new ArrayList<>();
		
		
		// can call only if generic
		someMethod(list);
		for (Child2 child2 : list) {
			
		}
		String[] arr =  {"as", "s"};
		String[] array = Arrays.stream(arr).filter((str) -> str.length() < 1).toArray(String[]::new);
	
	}
	
	
	// It could be List<Child> here so I can't add Parent to it
	public static void someMethod(List<? extends Parent> list) {
		Parent parent = list.get(0);
		// call specific parent method;
	
//		list.add(new Object());
		list.add(null);
	}
	
	public static void someMethod2(List<? super Child> list) {
//		list.add(new Object());
		list.add(new Child());
		list.add(new Child2());
//		list.add(new Parent());
		
		Object child = list.get(1);
	}

}

class Z<T extends Parent> {
	
	private T someField;
	
	public Z(T t) {
		this.someField = t;
	}
	
	public T getSomeField() {
		return this.someField;
	}
	
	public <E> E someMethod(E t) {
		return null;
	}
	
}


class Parent  {
	
}

class Child extends Parent {
	
}

class ChildChild extends Child {
	
}

class Child2 extends Child {
	
}



