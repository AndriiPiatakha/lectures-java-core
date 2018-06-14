package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue<>((s1, s2) -> s1.compareToIgnoreCase(s2));
		
		queue.offer("abc");
		queue.offer("zex");
		queue.offer("bcd");
		queue.offer("Abc");
		queue.offer("Bcd");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

	}

}
