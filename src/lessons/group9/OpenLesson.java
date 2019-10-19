package lessons.group9;

public class OpenLesson {
	
	private String name;
	private int age;
	
	public OpenLesson(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		System.out.println("hello world");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

