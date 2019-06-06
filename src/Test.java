import java.util.HashSet;
import java.util.Set;

public class Test {
	
	public static void main(String[] args) {
		Object o = new Object();
		Set set = new HashSet<>();
		System.out.println(set.add(o));
		System.out.println(set.add(o));
	}

}
