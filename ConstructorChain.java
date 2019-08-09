package assignment3;

class SubClass extends ConstructorChain{
	public SubClass() {
		super();
		System.out.println("Default subclass...");
	}
}

public class ConstructorChain {
	public ConstructorChain() {
		System.out.println("Default superclass...");
	}
	
	public ConstructorChain(String s) {
		this();
		System.out.println("Message Constructor: " + s);
	}
	
	public static void main(String[] args) {
		System.out.println("Constructor chain with in the same class:");
		ConstructorChain cc = new ConstructorChain("Hello World.");
		System.out.println("Constructor chain between child and parent classes: ");
		SubClass sc = new SubClass();
	}
}
