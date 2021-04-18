package polymorphism.compile_time;

class Check{
	public void value(int a) {
		System.out.println("Integer");
	}
	public void value(String a) {
		System.out.println("String");
	}
	public void value(float a) {
		System.out.println("float");
	}
	public void value(String a, int b) {
		System.out.println("String and Integer");
	}
	public void value(float a, String b) {
		System.out.println("Float and String");
	}
	
}

public class Text2 {

	public static void main(String[] args) {
		Check ch = new Check();
		ch.value(1);
		ch.value("The Stylish Coder");
		ch.value(5f);
		ch.value(5.5f, "The stylish Coder");
		ch.value("The Stylish Coder", 10);
		
		

	}

}
