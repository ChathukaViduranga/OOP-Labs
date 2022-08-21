package exercise2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Student s1= new Student("S001","Nimal");
		Student s2= new Student("S002","Amal");
		Student s3= new Student("S003","Sunimal");
		
		ArrayList<Student> studentList= new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		for (Student student : studentList) {
			student.displayDetails();
		}
		

	}

}
