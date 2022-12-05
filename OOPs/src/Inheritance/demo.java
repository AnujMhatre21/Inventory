package Inheritance;

public class demo {
	public static void main(String args[]) {
		ParentClass pc = new ChildClass();
//		ChildClass pc=new ParentClass();
		// calling display() method by parent class object
		pc.display();
	}
}

// parent class
class ParentClass {
	// we cannot override the display() method
	public static void display() {
		System.out.printf("display() method of the parent class.");
	}
}

// child class
class ChildClass extends ParentClass {
	// the same method also exists in the ParentClass
	// it does not override, actually it is method hiding
	public static void display() {
		System.out.println("Overridden static method in Child Class in Java");
	}
}
