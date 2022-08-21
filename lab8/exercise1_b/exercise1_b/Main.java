package exercise1_b;

public class Main {

	public static void main(String[] args) {
		Float arr1[]= {45f,32f,56f,21f,51f};
		Double arr2[]= {32.3,43.4,1.1,81.3,22.0};
		
		Sort<Float> s1= new Sort<>(arr1);
		Sort<Double> s2= new Sort<>(arr2);
		
		s1.bubbleSort();
		s2.bubbleSort(); 
		
		s1.print();
		s2.print();
	}

}
