package lessons.group10;

public class LessonOOP {
	
	private int age;
	private String name;
	
	{
		age = 10;
	}
	
	static {
		
	}
	
	public LessonOOP() {
		// nothing here
	}
	
	public LessonOOP(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public static void doSmth() {
		
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public static class NestedClass {
		
	}
	
	public class InnerClass {
		
	}
	

}


interface LessonOOPI {
	
	int GLOBAL_COUNTER = 0;
	
	void doSmth();
	
	default void doSmthDefault() {
		
	}
	
	static void doSmthStatic() {
		
	}
}

interface SpaceRocket {
	
	void flyAsRocket();
}

class UserOop implements LessonOOPI, SpaceRocket {

	@Override
	public void doSmth() {
		System.out.println("I'm doing smth");
	}

	@Override
	public void flyAsRocket() {
		// TODO Auto-generated method stub
		
	}
	
}


