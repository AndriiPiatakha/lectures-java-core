package lessons.group8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public class Lesson11 {

	private List someList;

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("a");
		
//		String string = list.get(0);
//		System.out.println(list.size());
//		
//		for (Object object : list) {
//			System.out.println(object);
//		}
		
		
		Iterator<String> iterator = list.iterator();
		System.out.println(iterator.next());
		
		iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

	public void doSmth(List list) {

	}

}
