package generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class GenericDemo3<T> {
	
	private T t;
//	private K k;
//	private E e;

	public void add(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public static void main(String[] args) {
		GenericDemo3<Integer> integerBox = new GenericDemo3<>();
		GenericDemo3<String> stringBox = new GenericDemo3<>();

		integerBox.add(new Integer(10));
		stringBox.add("Hello World");
		
		Integer integer = integerBox.get();
		String string = stringBox.get();

		System.out.printf("Integer Value :%d\n\n", integer);
		System.out.printf("String Value :%s\n", string);
		
		// ======================
		
		List<Integer> coll = new ArrayList<>();
		List coll2 = new ArrayList();
		coll2.add("String");
		coll2.add(1);
		coll = coll2;
		
		Integer integer2 = coll.get(0);
		System.out.println(integer2);
		
		Function<String, Integer> function = (s -> 1);
	}
}
