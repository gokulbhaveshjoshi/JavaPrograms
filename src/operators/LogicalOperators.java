package operators;

/*
 * Logical Operators are used to check whether an expression is true or false, 
 * they are used in decision making
 */

public class LogicalOperators {

	public static void main(String[] args) {
		int a=4, b=5, c=6;
		System.out.println("(a<b && b>c): " + (a<b && b>c));
		System.out.println("(a<b || b>c): " + (a<b || b>c));
		System.out.println("(a<b != b>c): " + (a<b != b>c));

	}

}
