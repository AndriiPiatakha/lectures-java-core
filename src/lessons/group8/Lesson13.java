package lessons.group8;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Lesson13 {
	
	public static void main(String[] args) {
//		int i = 1;
//		int i2 = 1;
//		float f = i / 0.0F;
//		System.out.println(f);
		
		Map<TestLesson13, String> map = new HashMap<>();
		TestLesson13 tl = new TestLesson13();
		map.put(tl, "1");
		System.out.println(map.get(tl));
		tl.setAge(11);
		System.out.println(map.get(tl));
	
	}

}

class TestLesson13 {
	
	private String name;
	private int age;
	
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
		
//		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestLesson13 other = (TestLesson13) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
