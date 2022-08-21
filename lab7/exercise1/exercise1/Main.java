package exercise1;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList <Integer>al= new ArrayList<Integer>();
		
		Scanner s1= new Scanner(System.in);
		if(al.isEmpty()) {
			for(int i=0;i<10;i++) {
				System.out.print("Enter number "+(i+1)+" : ");
				al.add(s1.nextInt());
			}
		}
		
		int total=0;
		for(int i=0;i<10;i++) {
			total+=al.get(i);
		}
		
		System.out.println("The total is : "+total);
		System.out.println(al);

	}

}
