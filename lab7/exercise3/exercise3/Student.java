package exercise3;

import java.util.HashSet;
import java.util.Set;

public class Student {
	private double Height;
	private static Set <Double> heightSet = new HashSet<>();

	public Student(double height) {
	
		Height = height;
		heightSet.add(Height);
	}
	
	public static void displayHeights() {
		System.out.println(heightSet);
	}

	public void getheight() {
		System.out.println("Height is : "+Height);
	}
}
