package exercise1;

public class Main  {

	public static void main(String[] args) {
		
		Sort sort1 = new Sort();
		
		Integer arr[]= {1,21,3,4,35,6,7,8,9,10};
		
		for(int i=0;i<10;i++){
			System.out.print(arr[i]+",");	
		}
		
		System.out.println("\n");
		
		
		sort1.bubbleSort(arr);
		
		for(int i=0;i<10;i++){
			System.out.print(arr[i]+",");	
		}
		
		

	}
	

}
