package lessons.group2;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//import org.apache.commons.collections4.queue.CircularFifoQueue;

public class Lesson13_2 {
	
	public static void main(String[] args) {
//		CircularFifoQueue<String> str = new CircularFifoQueue<>();
		
		Collection<?> c = new ArrayList<String>();
//		c.add(new Object()); // Compile time error
		c.add(null);
		
		List emptyList = Collections.EMPTY_LIST;
		System.out.println(Instant.EPOCH);
		long start = System.currentTimeMillis();
		// some function;
		long delta = System.currentTimeMillis() - start;
		
		
	}

}
