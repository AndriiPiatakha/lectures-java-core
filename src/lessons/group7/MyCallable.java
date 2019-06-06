package lessons.group7;

import java.util.List;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer>{
	
	private List<Integer> numbersToFind;
	
	public MyCallable(List<Integer> numbers) {
		this.numbersToFind = numbers;
	}

	@Override
	public Integer call() throws Exception {
		return numbersToFind.stream().mapToInt((i) -> i).max().getAsInt();
	}

}
