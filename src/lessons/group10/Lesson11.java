package lessons.group10;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Lesson11 {
	
	public static int counter = 0;
	
	public static void main(String[] args) throws InterruptedException {
//		byte b = 0b01000000;
//		System.out.println(b);
//		System.out.println((byte)(b << 1));
//		Set set = new HashSet();
//		set.add(1);
//		set.add(2);
//		set.add(1);
//		
//		set.add(new SomeClass1());
//		set.add(new SomeClass1());
//		
//		System.out.println(set.size());
		
//		Thread t = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println(Thread.currentThread().getName());	
//			}
//			
//		});
//		t.start();
//		System.out.println(Thread.currentThread().getName());
//		
//		Thread t2 = new Thread(() -> System.out.println("hello"));
//		t2.start();
//		
//		Thread t3 = new Thread() {
//			@Override
//			public void run() {
//				System.out.println("hello 3");
//			}
//		};
//		
//		t3.start();
		
		
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		for (int i = 0; i < 1000; i++) {
//			System.out.println(counter);
//			es.execute(() -> counter++);
			es.execute(Lesson11::increment);
		}
		
		es.shutdown();
		es.awaitTermination(5, TimeUnit.SECONDS);
		List<Runnable> nonFinishedTasks = es.shutdownNow();
		System.out.println(counter);
		
//		Thread t1 = new Thread(() -> {
//			counter++;
//		});
//		Thread t2 = new Thread(() -> {
//			counter++;
//		});
//		for (int i = 0; i < 1000; i++) {
//			Thread t1 = new Thread(() -> {
//				counter++;
//			});
//			t1.start();
//		}
//		
//		Thread.sleep(1000);
//		
//		
//		System.out.println(counter);
		
		Thread.sleep(10);
		
	}

	public static void increment() {
		synchronized (Lesson11.class) {
			counter++;
		}
		
	}
	
	public synchronized static void increment2() {
			counter++;
	}
	
	public synchronized void increment3() {
		counter++;
	}
	
	public void increment4() {
		
		synchronized (this) {
			counter++;
		}
	}

}


class SomeClass1 {
	public int i;

	@Override
	public int hashCode() {
		return Objects.hash(i);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SomeClass1 other = (SomeClass1) obj;
		return i == other.i;
	}
	
	
	
}

class LRUCache extends LinkedHashMap {

	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return super.get(key);
	}

	@Override
	protected boolean removeEldestEntry(Entry eldest) {
		// TODO Auto-generated method stub
		return super.removeEldestEntry(eldest);
	}

	@Override
	public Object put(Object key, Object value) {
		// TODO Auto-generated method stub
		return super.put(key, value);
	}
	
	
	
}


