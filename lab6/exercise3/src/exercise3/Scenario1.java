package exercise3;

import java.util.ArrayList;
import java.util.Scanner;

public class Scenario1 {
	
	private static StringBuilder log = new StringBuilder("-------System log------\n");

	public static void main(String[] args) {
		
		ArrayList<String> firstNames = new ArrayList<>();
		ArrayList <String>lastNames = new ArrayList<>();
		
		Scanner scanner1= new Scanner(System.in);
		System.out.print("Enter number of names you want to enter : ");
		int x=scanner1.nextInt();
		
		for(int i=0;i<x;i++) {
			System.out.print("Enter First name : ");
			firstNames.add(scanner1.next());
			System.out.print("Enter last name : ");
			lastNames.add(scanner1.next());
			
		}
		
		displayFullNames(firstNames, lastNames);
		
		
		int error[] = {401,403,404};
		generateError(error);
		
		System.out.println(log);

	}

private static void generateError(int[] error) {
	  log=log.append("Generated an error report\n");
	  
	  for (int i : error) {
		  switch (i) {
		  case 400:{
			  System.out.println("Bad Request");
			  break;
		  }
		case 401: {
			System.out.println("Unauthorized");
			break;
			
		}
		case 402:{
			System.out.println("Payment Required");
			break;
		}
		case 403:{
			System.out.println("Forbidden");
			break;
		}
		case 404:{
			System.out.println("Not Fount");
			break;
		}
		case 405:{
			System.out.println("Method Not Allowed");
		}
		default:
			throw new IllegalArgumentException("Unexpected error value: " + i);
		}
		
	  }
	  
	
}
private static void displayFullNames(ArrayList<String> firstNames, ArrayList <String>lastNames) {
	log=log.append("Displayed Full names\n");
	
	StringBuffer str= new StringBuffer();
	
	for(int i=0;i<firstNames.size();i++) {
		str=str.append(firstNames.get(i)+" "+lastNames.get(i)+",");
	}
	
	System.out.println(str);
	
}
}
