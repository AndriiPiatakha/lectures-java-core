package lessons.group8;

public class Lesson10 extends Lesson9 {
	
	public void doSmth1() {

	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Lesson9 l = new Lesson9();
		Lesson9 clone = (Lesson9) l.clone();
		System.out.println(l.b == clone.b);
	}

}
