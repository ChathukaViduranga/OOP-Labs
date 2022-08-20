package exercise2;

public class StringBuilderQuestions {

	public static void main(String[] args) {
		
		StringBuilder  str= new StringBuilder("hello");
		
		str=str.append(" World");
		
		str=str.replace(0, 5, "hi");
		
		System.out.println(str);
		
		
	}

}
