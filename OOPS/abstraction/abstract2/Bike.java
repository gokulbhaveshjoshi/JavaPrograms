package abstraction.abstract2;

public abstract class Bike {
	Bike(){
		System.out.println("Bike is created");
	}
	
	abstract void run();
	
	void changeGear() {
		System.out.println("Gear changed");
	}

}
