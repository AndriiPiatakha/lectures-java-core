package lessons.group11;

import java.util.Arrays;

public class DemoOopHw {
	
	public static void main(String[] args) {
		StudentService ss = new StudentService();
		
		Student[] students = ss.generateRandomStudents(5);
		Address address = new Address("Ukraine");
		
		students[0].setAddress(address);
		students[1].setAddress(address);
		
		Student[] filteredStudentsByCountry = ss.filterStudentsByCountry("ukraine", students);
		System.out.println(Arrays.toString(filteredStudentsByCountry));
	}

}
