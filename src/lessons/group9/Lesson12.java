package lessons.group9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Lesson12 {
	
	public static void main(String[] args) {
//		List<String> list = new ArrayList();
//		for (String string : list) {
//			
//		}
		
//		Map<SomeKey, String> map = new HashMap<>();
//		SomeKey someKey = new SomeKey();
//		SomeKey someKey2 = new SomeKey();
//		map.put(someKey, "string");
//		
//		System.out.println(map.get(someKey));
//		someKey.someInt = 10;
//		System.out.println(map.get(someKey));
		
//		System.out.println(Collections.max(new ArrayList()));
		
		Set<SomeSetItem> set = new HashSet<>();
		set.add(new SomeSetItem());
		set.add(new SomeSetItem());
		System.out.println(set.size());
		
		Map<String, String> synchronizedMap = 
				Collections.synchronizedMap(new HashMap<String, String>());
	}

}

class SomeKey {
	
	public int someInt;
	public String someString;
	public List<String> list;

	@Override
	public int hashCode() {
		return Objects.hash(list, someInt, someString);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SomeKey other = (SomeKey) obj;
		return Objects.equals(list, other.list) && someInt == other.someInt
				&& Objects.equals(someString, other.someString);
	}
	
	
	
}

class SomeSetItem {
	
	private int i;

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
		SomeSetItem other = (SomeSetItem) obj;
		return i == other.i;
	}
	
	
	
}
