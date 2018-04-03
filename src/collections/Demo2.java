package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo2 {

	public static void main(String[] args) {

		// Set<String> set = new HashSet<>(Arrays.asList("as", "asda", "as"));
		// // LinkeHashSet
		//
		// Set<CustomObject> set2 = new HashSet<>(20, 0.90F);
		//
		//// for (String string : set) {
		//// System.out.println(string);
		//// }
		//
		// CustomObject co = new CustomObject();
		// set2.add(co);
		// System.out.println(set2.add(co));
		//
		// System.out.println(set2.size());

//		Set<CustomObject> set3 = new HashSet<>();
//
//		set3.add(new CustomObject(1));
//		set3.add(new CustomObject(1));
//
//		System.out.println(set3.size());

//		Set<CustomObject2> set4 = new HashSet<>();
//		System.out.println(new Object().hashCode());
//		System.out.println(new Object().hashCode());
//		set4.add(new CustomObject2(1));
//		set4.add(new CustomObject2(1));
//
//		System.out.println(set4.size());
//		
//		Iterator<CustomObject2> iterator = set4.iterator();
//		
//		TreeSet<String> s = new TreeSet<>();
//		
//		Map<Object, Object> unmodifiableMap = 
//				Collections.unmodifiableMap(new HashMap<>());
		
//		Hashtable<String, String> ht = new Hashtable<>();
//		ht.put(null, null);
		
		Map<String, String> map = new HashMap<>();
		map.put(null, null);
		
//		Map<CustomObject2, String> map2 = new HashMap<>();
//		CustomObject2 co = new CustomObject2(1);
//		map2.put(co, "some");
//		System.out.println(co.hashCode());
//		
//		System.out.println(map2.get(co));
//		
//		co.setI(2);
//		System.out.println(co.hashCode());
//		
//		System.out.println(map2.get(co));
//		
//		Set<Entry<String, String>> entrySet = map.entrySet();
//		for (Entry<String, String> entry : entrySet) {
//			System.out.println(entry.getKey() + " == " + entry.getValue());
//		}
//		
//		Set<String> keySet = map.keySet();
//		Collection<String> values = map.values();
		
		// LRU cache,  LFU cache        eviction policy - term related to caches

//		LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
		
		
		TreeMap<String, String> tm = new TreeMap<>();
		tm.put("z", "");
		tm.put("a", "first");
		System.out.println(tm.firstEntry());
		
		
		TreeMap<CustomObject2, String> tm2 = new TreeMap<>();
		tm2.put(new CustomObject2(), "");
		
		TreeMap<CustomObject, String> tm3 = new TreeMap<>((o1, o2) -> {
			//some comparing logic
			return 1;
		});
		
		TreeMap<CustomObject, String> tm4 = new TreeMap<>(new Comparator<CustomObject>() {

			@Override
			public int compare(CustomObject o1, CustomObject o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		
		// Utility class Collections

		
	}
	
	public List test() {
		// impossible to create list, but don't want to return null value
		return Collections.emptyList();
	}
	
	public List test2() {
		return new ArrayList<>();
	}

}

class CustomCache extends LinkedHashMap<String, String> {
	
	public static final int MAX_CACHE_SIZE = 100;
	
	@Override
	public boolean removeEldestEntry(Map.Entry<String,String> eldest) {
		// implement custom logic
		return this.size() > 100;
	}
}

class CustomObject {

	private int someInt;

	public CustomObject() {
		// TODO Auto-generated constructor stub
	}

	public CustomObject(int i) {
		this.someInt = i;
	}

}

class CustomObject2 implements Comparable<CustomObject2> {

	private int someInt;

	public CustomObject2() {
		// TODO Auto-generated constructor stub
	}

	public CustomObject2(int i) {
		this.someInt = i;
	}
	
	public void setI(int i) {
		this.someInt = i;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + someInt;
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
		CustomObject2 other = (CustomObject2) obj;
		if (someInt != other.someInt)
			return false;
		return true;
	}

	@Override
	public int compareTo(CustomObject2 otherObject) {
		// TODO Auto-generated method stub
		return 0;
	}

}
