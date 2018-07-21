package lessons;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Lesson1 {
	
	public static void main(String[] args) {
		byte \u0041 = 1;
		System.out.println("Hello");
		String str = "some string";
		WeakReference<String> wr = new WeakReference<String>("some string");
		SoftReference<String> sr = new SoftReference<String>("s");
		
		char c = 0;
		
		boolean bool =  true;
		
		byte b = 1;
		short s = 1;
		int i = 1;
		long l = 1;
		
		float f = 0.1F;
		double d = 0.1;
		
//		b = (byte)130;
//		
//		System.out.println(b);
//		
//		while (b > 0) {
//			b++;
//			System.out.println(b);
//		}
//		
//		System.out.println(i - c);
		
		
		b = (byte)l;
		System.out.println(l);
		
		d = l;
		f = i;
	}

}
