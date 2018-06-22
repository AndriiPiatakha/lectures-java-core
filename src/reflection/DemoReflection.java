package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;


public final class DemoReflection implements A3 {
	
	private String str;
	public int i;
	private int iPrivate;
	private String strPrivate;
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, NoSuchFieldException {
		DemoReflection dr = new DemoReflection();
		Class clazz = DemoReflection.class;
		Class clazz2 = dr.getClass();
		
//		int modifiers = clazz.getModifiers();
//		System.out.println(modifiers);
//		if (Modifier.isPublic(modifiers)) {
//			System.out.println("Public");
//		}
//		if (Modifier.isFinal(modifiers)) {
//			System.out.println("Final");
//		}
		
//		Field[] fields = clazz.getDeclaredFields();
//		for (Field field : fields) {
//			field.setAccessible(true);
//			System.out.println(field);
////			System.out.println(field.getName());
//		}
//		
//		Arrays.stream(fields).forEach(System.out::println);
		
		Main main = new Main();
		Class<? extends Main> classMain = main.getClass();
		Method[] declaredMethods = classMain.getDeclaredMethods();
		Arrays.stream(declaredMethods).forEach(System.out::println);
		
//		Class.forName("com.jdbc.driver.DriverManager");
		
//		Method testMethod = classMain.getDeclaredMethod("testMethod", String.class);
//		testMethod.setAccessible(true);
//		testMethod.invoke(main, "some string");	
		
//		Method testMethod = classMain.getDeclaredMethod("testMethod", String[].class);
//		testMethod.setAccessible(true);
//		
//		String[] arr = {"some string"};
//		testMethod.invoke(main, new Object[]{arr});	
//		
		dr.str = "Before";
		System.out.println(dr.str);
		DemoReflection drBefore = dr;
		
		Field field = clazz.getDeclaredField("str");
//		field.setAccessible(true); // because in this class
		field.set(dr, "After");
		
		DemoReflection drAfter = dr;
		System.out.println(dr.str);
		System.out.println(drBefore.hashCode() == drAfter.hashCode());
		
	}

}

interface A3 {
	
}
