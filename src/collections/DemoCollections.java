package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DemoCollections {
	
	private int i;
	private String s;
	private Map map;
	
	public static void main(String[] args) {
		List<Object> unmodifiableList = Collections.unmodifiableList(new ArrayList<>());
		unmodifiableList.add(new Object());
		
		List<Object> synchronizedList = Collections.synchronizedList(new ArrayList<>());
		
		Collections.emptyList();
		
		List doSmth = doSmth();
		if (!doSmth.isEmpty()) {
			
		}
	}
	
	private static List doSmth() {
		if (false) {
			return new ArrayList<>();
		} else {
			return Collections.emptyList();
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		result = prime * result + ((map == null) ? 0 : map.hashCode());
		result = prime * result + ((s == null) ? 0 : s.hashCode());
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
		DemoCollections other = (DemoCollections) obj;
		if (i != other.i)
			return false;
		if (map == null) {
			if (other.map != null)
				return false;
		} else if (!map.equals(other.map))
			return false;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		return true;
	}
	
	public int otherHashCode() {
		return Objects.hash(i, map, s);
	}
	
	public boolean otherEquals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DemoCollections other = (DemoCollections) obj;
		
		return Objects.equals(this.i, other.i) && 
				Objects.equals(this.map, other.map) &&
				Objects.equals(this.s, other.s);
	}

}
