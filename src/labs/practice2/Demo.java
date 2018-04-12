package labs.practice2;

import java.util.Arrays;
import java.util.Iterator;

/**
 * 
 * Demonstrates functionality of MyListImpl class.
 * 
 * @author Andrey Pyatakha
 *
 */
public class Demo {
	
	/**
	 * Enter point to Demo class.
	 * @param args
	 */
	
	public static void main(String[] args) {
		MyListImpl list = new MyListImpl();
		MyListImpl list2 = new MyListImpl();
		System.out.println("Adding: ");
		list.add(1);
		list.add("2");
		list.add('3');
		list.add(true);
		list.add(false);
		list.add("six");
		list.add("seven");
		
		list2.add(1);
		list2.add('3');
		
		System.out.println(list);
		
		System.out.println("\nRemove String \"2\": " + list.remove("2"));
		System.out.println(list);
		
		System.out.println("\nObject to array: ");
		Object[] obj = list.toArray();
		System.out.println(Arrays.toString(obj));
		
		System.out.println("\nSize: " + list.size());
		
		System.out.println("\nContains \"false\" literal: " 
					               + list.contains(false));
		
		System.out.println("\nList 1: " + list);
		System.out.println("List 2: " + list2);
		System.out.println("\nContains all: " 
								+ list.containsAll(list2) );
		
		System.out.println("\nIterator demo foreach loop: ");
		for (Object object : list) {
			System.out.println(object);
			}
		
		System.out.println("\nIterator demo with iterator object: ");
		Iterator<Object> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\nRemove with iterator: ");
		Iterator<Object> it2 = list.iterator();
		it2.next();
		it2.remove();
		System.out.println(list);
		
		it2.next();
		it2.next();
		it2.remove();
		
		System.out.println(list);
		
		System.out.println("\nListIterator demo: ");
		ListIterator iterList = list.listIterator();
		iterList.next();
		iterList.set("SET1");
		System.out.println(list);
		
		iterList.next();
		iterList.next();
		iterList.set("SET2");
		
		//iterList.set("2"); runtime exception
		
		System.out.println(list);
		
		System.out.println(iterList.previous());
		System.out.println(iterList.previous());
		
		

		
		ListIterator li2 = list.listIterator();
		System.out.println("List iterator next:  " + li2.next());
		System.out.println("List iterator next:  " + li2.next());
		System.out.println("List iterator next:  " + li2.next());
		System.out.println("List iterator previous:  " + li2.previous());
		System.out.println("List iterator remove:  " );
		li2.remove();
		System.out.println(list);
		
		
		
		System.out.println("\nClear: ");
		list.clear();
		System.out.println(list);
		
		
	}

}
