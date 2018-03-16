package reflection;

import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TestDemo implements I, A{
	
	private int a;
	private int b;
	public String str;
	
	public static boolean test(File pathname) {
		return pathname.isDirectory();
	}
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, NoSuchMethodException, InvocationTargetException {
		Class c = TestDemo.class;
		

		
		FileFilter ff = TestDemo::test;
		
		int modifiers = c.getModifiers();
//		System.out.println(modifiers);
//		System.out.println(Modifier.isPublic(modifiers));
//		System.out.println(c.getSuperclass().getName());
		
		Class[] interfaces = c.getInterfaces();
//		Arrays.stream(interfaces).forEach(System.out::println);
		
		Field[] fields = c.getFields();
//		Arrays.stream(fields).forEach(System.out::println);
		
		Field[] declaredFields = c.getDeclaredFields();
//		Arrays.stream(declaredFields).forEach(System.out::println);
		
		Field field = c.getField("str");
		TestDemo testDemo = new TestDemo();
		testDemo.setStr("test2");
//		System.out.println(field.get(testDemo));
		
		Method method = c.getDeclaredMethod("testMethod", String.class);
//		method.setAccessible(true);
		method.invoke(testDemo, "asdasd");
		
		Main main = new Main();
		Class classMain = main.getClass();
		Method method2 = classMain.getDeclaredMethod("testMethod", String.class);
//		method2.setAccessible(true);
//		method2.invoke(main, "aqsqcqc");
		
		
		List<Integer> integerList = new ArrayList<>();
		List list = integerList;
		List<String> stringList = list;

		stringList.add("Hello world");

		System.out.println("Integer value = " + integerList.get(0));
		
		D<ChildChildA> d = new D<>(new ChildChildA());
		System.out.println(d.getT());
		
		test2(d);
		
		method3(new ChildA());
	}
	
	public void setStr(String str) {
		this.str = str;
	}

	private void testMethod(String str) {
		System.out.println(str);
	}
	
	public static <T extends A> void method3(T t) {
		
	}
	
	public static void test2(D<? extends ChildA> s) {
		
	}
}

interface I {
	
}

interface A {
	
}

class ChildA implements A {
	
}

class ChildChildA extends ChildA {
	
}
class D <T extends A> {
	private T someField;
	
	D(T t) {
		this.someField = t;
	}
	
	public T getT() {
		return this.someField;
	}
	
	
}