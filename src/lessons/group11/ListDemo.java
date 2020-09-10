package lessons.group11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.TreeMap;

public class ListDemo {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
//		list.add("String");
		
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Hello");
		map.put(10, "World");
		map.put(2, "World");
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(10));
		
		System.out.println("================");
		
		for (Integer integer : map.keySet()) {
			System.out.println(integer);
		}
		
		System.out.println("================");
		
		for (String string : map.values()) {
			System.out.println(string);
		}
		
		System.out.println("================");
		
		for (Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			System.out.println("Key: " + key + "\tValue: " + entry.getValue());
		}
		
		System.out.println("================");
		
		NavigableMap<User, String> treeMap = 
				new TreeMap<>((user1, user2) -> user1.getId() - user2.getId());
		treeMap.put(new User(10), "someUser 10");
		treeMap.put(new User(1), "someUser 1");
		treeMap.put(new User(10), "someUser 10");
		
		System.out.println(treeMap.firstEntry().getValue());
		
		treeMap.put(new User(0), "someUser 0");
		
		System.out.println(treeMap.firstEntry().getValue());
		System.out.println(treeMap.ceilingEntry(new User(9)).getValue());
		
	}

}

class User implements Comparable<User> {
	
	private static int counter;
	
	private int id;
	private String firstName;
	private String lastName;
	
	
	public User() {
	}
	
	public User(int id) {
		this.id = id;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		User.counter = counter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, id, lastName);
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
		return Objects.equals(firstName, other.firstName) && id == other.id && Objects.equals(lastName, other.lastName);
	}

	@Override
	public int compareTo(User otherUser) {
		return this.getId() - otherUser.getId();
	}
	
	
	
	
}

