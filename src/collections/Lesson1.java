package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lesson1 implements Iterable<Lesson1> {
	
	public static void main(String[] args) {
//		Lesson1 l = new Lesson1();
//		for (Lesson1 o : l) {
//			System.out.println(o);
//			
//		}
//		
//		List<String> list = new ArrayList<String>();
//		Object[] array = list.toArray();
//		String[] a = list.toArray(new String[0]);
//		
		
		List<Integer> l = new ArrayList<>(Arrays.asList(1,3,4, 2, 2));
		List<Integer> l2 = new ArrayList<>(Arrays.asList(1,2));
		
		l.retainAll(l2);
		System.out.println(l);
		
		l.removeAll(l2);
		System.out.println(l);
		
		
		
	}


	@Override
	public Iterator<Lesson1> iterator() {
		return null;
	}

}
