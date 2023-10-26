package Student;

import java.util.Comparator;


public class Student {
	//attributes
	private int studentId;
	private String name;
	private String course;
	
	//constructor
	public Student(int studentId, String name, String course) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.course = course;
	}

	//Implement custom sorting order by name
	public static final Comparator<Student> NAME_COMPARATOR = Comparator.comparing(Student::getName);
	
	//Implementing custom sorting order by id
	public static final Comparator<Student> ID_COMPARATOR = Comparator.comparingInt(Student::getStudentId); 
	
	
	//getter and setter
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", course=" + course + "]";
	}
	
	
	
	

}
