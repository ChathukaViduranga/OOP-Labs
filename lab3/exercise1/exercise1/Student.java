package exercise1;

public class Student {
	private String name,ditno,address;

	public Student(String name, String ditno, String address) {
		super();
		this.name = name;
		this.ditno = ditno;
		this.address = address;
	}
	
	public void display() { 
		System.out.println("Name : "+name);
		System.out.println("Ditno : "+ditno);
		System.out.println("Address : "+address);
		
	}


}
