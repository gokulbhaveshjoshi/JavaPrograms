package polymorphism.runtime;

class Animals{
	public void move() {
		System.out.println("Animal can walk");
		
	}
}

class Dog extends Animals{
	public void move() {
		System.out.println("Dog can walk");
	}
}

public class Text {

	public static void main(String[] args) {
		Animals a = new Animals();
		Animals b = new Dog();
		a.move();
		b.move();
		

	}

}
