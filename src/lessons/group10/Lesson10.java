package lessons.group10;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.commons.collections4.bag.CollectionBag;

public class Lesson10 {
	
	private static final int DEFAULT_LIS_SIZE = 1_000_000;

	public static void main(String[] args) {
		
//		String str = "Andrey,,,,  \t . ? go home! Now!";
//		
//		String[] split = str.split("[,!\\.:;?\\s]+");
//		System.out.println(Arrays.deepToString(split));
//		System.out.println(File.separator);
		
//		Collection coll = new ArrayList();
//		Object obj = new Object();
//		coll.add(obj);
//		coll.add(1);
//		coll.add("smth");
//		
//		Iterator iterator = coll.iterator();
//		while (iterator.hasNext()) {
//			Object next = iterator.next();
//			System.out.println(next);
//			if (next.equals(obj)) {
//				iterator.remove();
//			}
////			coll.remove(obj);
//		}
//		
//		System.out.println(coll.size());
		
//		ArrayList arrayList = new ArrayList();
//		System.out.println(arrayList instanceof RandomAccess);
//		CopyOnWriteArrayList threadSafeList;
		
//		List<String> list = new ArrayList<>();
//		for (int i = 0; i < DEFAULT_LIS_SIZE; i++) {
//			list.add(new String("Andrey"));
//		}
//		
//		System.out.println(list.size());
//		
//		long startTime = System.currentTimeMillis();
//		insertFromBegining(list, 100);
//		System.out.println(System.currentTimeMillis() - startTime);
//		
//		
//		
		
		Map map = new HashMap();
		User u = new User();
		map.put(u, 10);
		System.out.println(map.get(u));
		u.age = 20;
		
		System.out.println(map.get(u));
		
		Set<Map.Entry<Object, Object>> entrySet = map.entrySet();
		for (Map.Entry entry : entrySet) {
			System.out.println(entry.getKey());
		}
		
		Set keySet = map.keySet();
		Collection values = map.values();
		
	}

	private static void insertFromBegining(List<String> list, int size) {
		for (int i = 0; i < size; i++) {
			list.add(0, new String("Andrey"));
		}
	}

}

class User {
	public int age;
	public String name;
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
}
