package lessons.group2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Lesson20 {
	
	public static void main(String[] args) throws SQLException {
//		Lesson20.class.getResourceAsStream("");
//		Lesson20.class.getClassLoader().getResourceAsStream("");
//		
//		try (Connection conn = null;
//				PreparedStatement ps = conn.prepareStatement("")) {
//			
//		}
		
		System.out.println(new Impl().getThisClass());
	}

}

abstract class Abstr1 {
	
	public Class getThisClass() {
		return this.getClass();
	}
	
}

class Impl extends Abstr1 {


	
}
