package exercise2;

interface ICompute {
    void calculate();
    void display();
}



class Person implements ICompute{
	   private String name;
	   private double basicSal;
	   private double otRate;
	   private double otHrs;
	   private double netSal;
	   
	   
	
	public Person(String name, double basicSal, double otRate, double otHrs) {
		super();
		this.name = name;
		this.basicSal = basicSal;
		this.otRate = otRate;
		this.otHrs = otHrs;
		
		
	}

	public void calculate() {
		this.netSal=basicSal+otRate*otHrs;
		
	}
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Net Salary : "+netSal);
		
	}
	   
}



class Box  implements ICompute {
	   private int length, width, height;
	   private int volume;
	   
	   
	
	public Box(int length, int width, int height) {
		
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public void calculate() {
	 this.volume=length*height*width;
		
	}

	public void display() {
		System.out.println("BoxVolume : "+volume);
		
	}
	}




public class Main {
	
	public static void main(String[] args) {
		

		
		ICompute ob2 = new Box(10, 20, 30);
	      ob2.calculate();
	      ob2.display();

	}

}
