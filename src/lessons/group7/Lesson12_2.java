package lessons.group7;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import com.sun.jmx.mbeanserver.ModifiableClassLoaderRepository;

public class Lesson12_2 implements AI, AI2 {
	
	private String productName;
	private Integer productAmount;
	
//	@Field(itemName = "Product amount")
	public void setProductAmount(Integer amount) {
		this.productAmount = amount;
	}
	
//	@Field(itemName = "Product name")
	public void setName(String name) {
		this.productName = name;
	}
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Class clazz = Lesson12_2.class;
		Class clazz2 = AI.class;
		
		Lesson12_2 l = new Lesson12_2();
		Class class1 = l.getClass();
		
//		System.out.println(clazz.isInterface());
//		System.out.println(clazz2.isInterface());
		
		clazz.getMethods();
		
		Class[] interfaces = clazz.getInterfaces();
		for (Class class2 : interfaces) {
			System.out.println(class2.getName());
			Field f = class2.getField("руль");
			f.setAccessible(true);
			f.get(new Object());
			System.out.println(Modifier.isPublic(class2.getModifiers()));
		}
	}

}

interface AI {
	
}

interface AI2 {
	
}
