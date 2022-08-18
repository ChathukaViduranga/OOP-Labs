package exercise1;

public class Student {
	private int studentID;
	private String name,degree,mobile;
	private static int max=100;
	
	public Student( String name, String degree, String mobile) {
		this.studentID = getNextStudentID();
		this.name = name;
		this.degree = degree;
		this.mobile = mobile;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void print() {
		System.out.println("Student ID : "+studentID);
		System.out.println("Student name : "+name);
		System.out.println("Degree : "+degree);
		System.out.println("Mobile : "+mobile);
	}
	
	private static int getNextStudentID() {
		return max++;
	}
	
	
	
	
	

}
