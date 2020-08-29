package lessons.group11;

import java.util.Arrays;

public class StudentService {
	
	public Student[] generateRandomStudents(int studentsAmount) {
		Student[] students = new Student[studentsAmount];
		for (int i = 0; i < studentsAmount; i++) {
			students[i] = new Student(i, "LastName" + i, "FirstName" + i);
		}
		return students;
	}
	
	public Student[] filterStudentsByCountry(String country, Student[] students) {
		return Arrays.stream(students)
					.filter((student) 
							-> {
								if (student.getAddress() != null && student.getAddress().getCountry() != null) {
									return student.getAddress().getCountry().equalsIgnoreCase(country);
								} else {
									return false;
								}
							})
					.toArray(Student[]::new);
	}

}
