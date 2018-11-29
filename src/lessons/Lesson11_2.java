package lessons;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Lesson11_2 {
	
	public static void main(String[] args) {
//		Stack s = new Stack<>();
//		Queue<String> q = new PriorityQueue<>();
//		
//		q.offer("s");
//		q.offer("a");
//		q.offer("d");
//		
//		System.out.println(q.poll());
//		System.out.println(q.poll());
//		System.out.println(q.poll());
//		
//		PriorityQueue<A111> a = new PriorityQueue<>();
//		a.offer(new A111());
////		a.offer(new A111());
//		
////		System.out.println(a.poll());
//		
//		Integer[] arr = new Integer[Integer.MAX_VALUE - 5];
//		System.out.println(arr.length);
//		
//		A111 a = new A111();
//		A111 a2 = new A111();
//		Set s = new HashSet<>();
//		s.add(a);
//		System.out.println(s.add(a2));
//		
//		System.out.println(s.size());
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "value");
		String string = map.get("1");
		System.out.println(string);
		
	}

}

class A111 {
	
	private int i;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A111 other = (A111) obj;
		if (i != other.i)
			return false;
		return true;
	}
	
}
