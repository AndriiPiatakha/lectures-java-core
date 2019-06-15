package lessons.group7;

import java.util.ArrayList;
import java.util.List;

public class Lesson12 {
	
	private List<List<Integer>> lists;
	
	
	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<>();
//		System.out.println(list.size());
//		doSmth2(list);
//		System.out.println(list.size());
		
		int i = 1;
		System.out.println(i);
		doSmth3(i);
		System.out.println(i);
		
	}
	
	public static void doSmth3(int i) {
		i += 3;
	}
	
	public static void doSmth2(List<Integer> list) {
//		list = null;
		list.add(1);
	}
	
	
	public void doSmth() {
		int threads = 3;
		
		List<Runnable> tasks = new ArrayList<>();
		for(int i = 0; i < 3; i++) {
			List<Integer> list = new ArrayList<>();
			lists.add(list);
			tasks.add(new SomeRunnable(list));
		}
		
		// await termination
		
//		List<Integer> merged = mergeLists();
	}
	
	

}


class SomeRunnable implements Runnable {
	
	private List<Integer> list;

	public SomeRunnable(List<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
