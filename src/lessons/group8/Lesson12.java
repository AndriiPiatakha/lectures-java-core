package lessons.group8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.collections4.map.HashedMap;

public class Lesson12 {
	
	private Object[] arr;
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (int i = 0; i < arr.length; i++) {
			sb.append("[" + arr[i].toString() + "]");
			if (i != arr.length - 1) {
				sb.append(",");
			}
		}
		sb.append("}");
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		
//		
//		List<String> s = new ArrayList<>(Arrays.asList("1", "2", "3"));
//		
//		Iterator<String> iterator = s.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//			s.remove("1");
//			System.err.println();
//		}
//		
//		Map<String, String> map = new HashMap<>();
//		map.put("Key", "Value");
//		map.put("Key2", "Value2");
//		System.out.println(map);
//		
//		System.out.println(map.get("Key"));
//		
//		for (Map.Entry<String, String> entry : map.entrySet()) {
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//		}
		
//		Map<NonComparable, Integer> map = new TreeMap<>(
//				(o1, o2) -> o1.name.compareTo(o2.name));
//		Map<NonComparable, Integer> map = new TreeMap<>(Lesson12::doSmth);
//		Map<NonComparable, Integer> map = new TreeMap<>(
//				new Comparator<NonComparable>() {
//					@Override
//					public int compare(NonComparable o1, NonComparable o2) {
//						return o1.name.compareTo(o2.name);
//					}	
//				});
		
//		map.put(new NonComparable(), 1);
		
		
		
	}
	
	public static int doSmth(NonComparable o1, NonComparable o2) {
		return o1.name.compareTo(o2.name);
	}
	
	private class InnerTest {
		
	}
	
	private static class NestedClass {
		
	}

}

class NonComparable {
	
	public String name;
	
}
