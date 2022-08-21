package exercise3;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		Student s1= new Student(1.8);
		Student s2= new Student(0.5);
		Student s3= new Student(1.8);
		Student s4= new Student(1.9);
		Student s5= new Student(0.5);
		Student s6= new Student(1.8);
		Student s7= new Student(1.8);
		Student s8= new Student(0.5);
		Student s9= new Student(1.8);
		Student s10= new Student(1.8);
		
	    Student.displayHeights();
	    
	    HashMap <String,Student>students = new HashMap<>();
	    students.put("S001", s1);
	    students.put("S002", s2);
	    students.put("S003", s3);
	    students.put("S004", s4);
	    students.put("S005", s5);
	    students.put("S006", s6);
	    students.put("S007", s7);
	    students.put("S008", s8);
	    students.put("S009", s9);
	    students.put("S010", s10);
	    
	   students.get("S001").getheight() ;
	    
	    
		
	}
	
	

}
