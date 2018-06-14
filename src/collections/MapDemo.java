package collections;

import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	
	public static void main(String[] args) {
		
//		Map<Integer, String> map = new HashMap<>();
//		map.put(1, "One");
//		System.out.println(map.get(1));
//		map.put(null, null);
//		
//		Map<Integer, String> hashTable = new Hashtable<>();
////		hashTable.put(null, "");
////		hashTable.put(1, null);
////		hashTable.put(1, "");
		
		
		// =========================== 
		
//		User user = new User(1, "name", new Date());
//		Map<User, String> map = new HashMap<>();
//		map.put(user, "some value");
//		System.out.println(map.get(user));
//		
//		user.setName("Other name");
//		System.out.println(map.get(user));
//		
//		Set<Entry<User, String>> entrySet = map.entrySet();
//		Iterator<Entry<User, String>> iterator = entrySet.iterator();
//		while (iterator.hasNext()) {
//			Entry<User, String> next = iterator.next();
//			System.out.println(next.getValue() + " " + next.getKey());
//		}
//		
		
		// =================================
		
//		Map<User, String> tree = new TreeMap<>();
//		tree.put(new User(), null);
		
//		Map<ComparableUser, String> tree2 = new TreeMap<>();
//		tree2.put(new ComparableUser(), null);
//		System.out.println(tree2.size());
		
		Map<User, String> tree = new TreeMap<>(
				(user1, user2) -> user1.getI() - user2.getI());
		tree.put(new User(), null);
		System.out.println(tree.size());
	}

}


class User {
	private int i;
	private String name;
	private Date dob;
	
	public User() {
		
	}
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public User(int i, String name, Date dob) {
		super();
		this.i = i;
		this.name = name;
		this.dob = dob;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(this.i, this.name, this.dob);
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
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (i != other.i)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

class ComparableUser implements Comparable<ComparableUser> {

	@Override
	public int compareTo(ComparableUser o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
