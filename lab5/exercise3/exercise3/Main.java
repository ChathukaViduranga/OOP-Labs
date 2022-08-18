package exercise3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  int maxSubjects;
	      int [] marks = new int[5];
	      int total;
	      double avg;

	      Scanner s1= new Scanner(System.in);
	      
	      try {
			System.out.print("Enter value for max Subjects : ");
			  maxSubjects=s1.nextInt();
			  
			  total =0;
			  for(int i=0;i<maxSubjects;i++) {
				  System.out.print("Enter Subject "+(i+1)+" marks : ");
				  marks[i]=s1.nextInt();
				  total+=marks[i];
			  }
			  
			  avg=(double)total/(double)maxSubjects;
			  
		} catch ( InputMismatchException e) { //InputMismatchException ArrayIndexOutOfBoundsException ArithmeticException
			
			
			System.out.println("Only integer values can be read");
		}
	      catch(ArrayIndexOutOfBoundsException e) {
	    	  System.out.println("Maximum number of subjects is 5");
	    	  
	      }
	      finally {
	    	  System.out.println("This code is gurrentied to run");
	    	  
	      }
	      System.out.println("the end");
	      
	      
	      
	 }

}
