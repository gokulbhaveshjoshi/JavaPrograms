package polymorphism.compile_time;


public class Text {
	public int add(int a, int b) {
		return (a+b);
	}
	
	public double add(double a, double b) {
		return (a+b);
	}
	

	public static void main(String[] args) {
		Text t = new Text();
		int a = t.add(5, 8);
		double b = t.add(50, 150);
		System.out.println("Sum of Int "+a);
		System.out.println("Sum of double "+b);

	}

}
