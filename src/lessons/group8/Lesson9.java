package lessons.group8;

public class Lesson9 implements Cloneable {
	
	public B123 b;
	public int i;
	
	public Lesson9() {
//		this.b = b;
		this.b = new B123();
	}
	
	public void doSmth() {
		b.doSmthSpecific();
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
//		Lesson9 l = new Lesson9();
		
		return super.clone();
	}
	
//	public static void main(String[] args) {
//		B123 b = new B123();
////		Lesson9 l = new Lesson9(b);
//		Lesson9 l = new Lesson9();
////		l.doSmthSpecific();
//		l = null;
//		
//	}

}

class B123 {

	public void doSmthSpecific() {
		
	}
}
