package lessons.group10;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCaches extends LinkedHashMap<Integer, Integer> {

	private final int capacity;

	public LRUCaches(int capacity) {
		super(capacity, 1.1f, true);
		this.capacity = capacity;
	}

	public int get(int key) {
		return super.getOrDefault(key, -1);
	}

	public void put(int key, int value) {
		super.put(key, value);
	}

	@Override
	protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
		return size() > capacity;
	}

} 
