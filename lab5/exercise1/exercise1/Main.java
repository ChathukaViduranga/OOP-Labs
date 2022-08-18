package exercise1;

//Animal Class
abstract class Animal {
	   private String name;
	   
	   public Animal(String name) {
		   System.out.println("Animal Constructor is called");
	       this.name = name;
	       
	   }
	   
	  abstract public String speak();
	  
	  public void display() {
	      System.out.println("My name is " + this.name + ".  " + this.speak() + ".");
	  }
	}

//Dog class

class Dog extends Animal {
	   public Dog(String name) {
	      super(name);
	      System.out.println("Dog Constructor is called");
	   }
	   public String speak() {
	       return "Bow Wow";
	   }
	}

//Cat class
class Cat extends Animal {
	  public Cat(String name) {
	      super(name);
	      System.out.println("Cat Constructor is called");
	   }
	  public String speak() {
	      return "Meow Meow";
	  }
	}

//toy cat class

class ToyCat extends Cat {
	  String manufacturer;
	  public ToyCat(String name, String manufacturer) {
	     super(name);
	     this.manufacturer = manufacturer;
	     System.out.println("Toy    cat Constructor is called");
	     
	  }
	  
	  public void display() {
		     super.display();
		     System.out.println("I am from " + manufacturer + ".");
		  }
 }


public class Main {

	public static void main(String[] args) {
		
	     
	     Cat mycat = new Cat("Micky");
	     mycat.display();
	     
	     Dog mydog = new Dog("Rover");
	     mydog.display();
	     
	     ToyCat mytoy = new ToyCat("kittie","Toysrus");
	     mytoy.display();

	}

}
