package Student;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//create a registration obj
		
		Student studentPranay = new Student(11, "Pranay", "java");
		Student studentVenky = new Student(12, "venky", "java");
		Student studentNTR = new Student(13, "NTR", "java");
				
		Registration r = new Registration();
		
		r.add(studentPranay);
		r.add(studentPranay);
		r.add(studentVenky);
		r.add(studentNTR);
		
		r.viewAllStudents();
		
//		System.out.println("++++++++++++++++++++++++");
//		
		r.remove(12);
		r.viewAllStudents();		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter student id");
//		int id= sc.nextInt();
//		sc.nextLine();
//		System.out.println("Enter student name");
//		String name = sc.nextLine();
//		System.out.println("Enter student course");
//		String course = sc.nextLine();
//		r.updateStudent(id,name,course);
//		
//		r.viewAllStudents();
		
		r.searchDetails("13");
		
		
	}

}
