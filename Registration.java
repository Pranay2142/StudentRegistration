package Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Registration {

	List<Student> students;

	public Registration() {
		students = new ArrayList<>();
	}


	//methods to add ,remove,and view all students
	public void add(Student stu) {
		boolean isDuplicate = students.stream().
				anyMatch(s -> s.getStudentId() == stu.getStudentId());
		if(isDuplicate) {
			System.out.println("students details already exists");
		}
		else {
			students.add(stu);
			
		}
		}

	public void remove(int studentId) {
		Iterator<Student> it = students.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			if( s.getStudentId() == studentId) {
				it.remove();
				return;
			}
			
		}System.out.println(studentId + " not found");
	}

	// Method to view all registered students
	public void viewAllStudents() {
		for (Student student : students) {
			System.out.println("Student ID: " + student.getStudentId());
			System.out.println("Name: " + student.getName());
			System.out.println("Course: " + student.getCourse());
			System.out.println();
		}
	}

	//update student information based on student id
	public void updateStudent(int studentID, String name, String course) {
		for (Student student : students) {
			if (student.getStudentId() == studentID) {
				student.setName(name);
				student.setCourse(course);
				System.out.println("Student information updated successfully.");
				return;
			}
		}
		System.out.println("Student with ID " + studentID + " not found.");
	}
	
	//fetch students details by id
	public void searchDetails(String searchQuery) {
		for(Student s : students) {
			if(String.valueOf(s.getStudentId()).equals(searchQuery) 
					|| s.getName().equalsIgnoreCase(searchQuery)) {
				System.out.println("Student ID: " + s.getStudentId());
				System.out.println("Name: " + s.getName());
				System.out.println("Course: " + s.getCourse());
				System.out.println();
				return;
			
			}
		}
		System.out.println(" student id "+ searchQuery +" not found");
	}


}
