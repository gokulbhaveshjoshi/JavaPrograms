package abstraction;

abstract class Bike{
	abstract void run();
}

public class Hero extends Bike {
	void run() {
		System.out.println("Running Safety");
	}

	public static void main(String[] args) {
		Bike obj = new Hero();
		obj.run();

	}

}
