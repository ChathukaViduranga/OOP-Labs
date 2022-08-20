package exercise1;

public class StringBasic {

	public static void main(String[] args) {
		
		
	char[] greet= {'H','e','l','l','o'};
	String s= new String(greet);
	
	String s2= new String("Hello");
	
	String s3="Hello";
	
	System.out.println(s.equals(s3));
	
	String str= new String("Hello");
	
	str=str.replace('H', 'h');
	
	System.out.println(str.concat(" World"));
	
	}
	
	

}
