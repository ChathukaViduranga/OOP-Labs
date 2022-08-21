package exercise2;

public class Student {
	private String sID,name;

	public Student(String sID, String name) {
		
		this.sID = sID;
		this.name = name;
	}
	
	public void displayDetails() {
		System.out.println("The name is : "+name);
		System.out.println("SID : "+sID+"\n");
	}

}
