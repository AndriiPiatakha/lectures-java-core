package collections;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class LRUCache {

	private final int INITIAL_CAPACITY;
	private final ArrayDeque<LRUNode> nodes;
	private final Map<Integer, LRUNode> cache;

	public LRUCache(int capacity) {
		this.INITIAL_CAPACITY = capacity;
		this.nodes = new ArrayDeque<>(INITIAL_CAPACITY);
		this.cache = new HashMap<>();
	}

	public int get(int key) {
		LRUNode node = cache.get(key);
		if (node == null) {
			return -1;
		}
		nodes.remove(node);
		nodes.addFirst(node);
		return node.value;
	}

	public void put(int key, int value) {
		LRUNode node = cache.get(key);

		if (node != null) {
			node.value = value;
			nodes.remove(node);
			nodes.addFirst(node);
		} else {
			if (cache.size() >= INITIAL_CAPACITY) {
				LRUNode last = nodes.pollLast();
				cache.remove(last.key, last);
			}
			node = new LRUNode(key, value);
			nodes.addFirst(node);
		}

		cache.put(key, node);
	}

	private class LRUNode {

		private int key;
		private int value;

		LRUNode(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}
}