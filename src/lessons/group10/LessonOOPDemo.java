package lessons.group10;

public class LessonOOPDemo {
	
	public static void main(String[] args) {
		
		LessonOOP obj = new LessonOOP(15, "1");
		LessonOOP obj2 = new LessonOOP(20, "10");
		System.out.println(obj.getAge());	
		
		LessonOOP.doSmth();
		obj.doSmth();
		
		LessonOOP.NestedClass nestedObj = new LessonOOP.NestedClass();
		System.out.println();
		
		LessonOOP.InnerClass inner = new LessonOOP().new InnerClass();
		
		LessonOOPChild child = new LessonOOPChild();
		child.getAge();
		
		SpaceRocket[] rockets = {new UserOop()};
		for (SpaceRocket spaceRocket : rockets) {
			spaceRocket.flyAsRocket();
		}
		
		
		LessonOOPI[] interfaces = {new UserOop()};
		for (LessonOOPI lessonOOPI : interfaces) {
			lessonOOPI.doSmth();
		}

	}

}
