package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Demo1 {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		Collection c = new ArrayList<>();
		
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {
			
		}
		
		List list2 = new ArrayList<>();
		List list4 = new ArrayList<>(Arrays.asList("a", "b"));
		
		for (Object object : list2) {
//			string.equalsIgnoreCase("");
		}
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
//		for (String string : list) {
//			System.out.println(string);
//		}
		
		Iterator<String> iterator = list.iterator();
//		iterator.remove();
		
		
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		iterator.remove();
//		iterator.remove();
		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		
//		iterator = list.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
//		int i = 0;
		
		
		
		
//		
//		
//		
//		while(iterator.hasNext()) {
////			System.out.println(i++);
//			String next = iterator.next();
////			list.remove(next); // will lead us to ConcurModException
//			iterator.remove();
//			System.out.println(next);
//		}
//		System.out.println(list.size());
//		
//		
//		List<String> list6 = Arrays.asList("a", "b");
//		Iterator<String> iterator2 = list6.iterator();
//		iterator2.next();
//		iterator2.remove();
//		
//		
//		List<String> linkedList = new LinkedList<String>();
//		Deque<String> deque = new LinkedList<>();
//		
//		linkedList.add(4, "");
//		
//		ListIterator<String> listIterator = list.listIterator();
//		
//		listIterator.hasPrevious();
//		listIterator.previous();
//		
//		A10 a = new A10();
//		for (String string : a) {
//			
//		}
		
	}

}


class A10 implements Iterable<String> {

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
