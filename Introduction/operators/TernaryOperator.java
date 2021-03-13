package operators;
/*
 * The ternary operator (condition operator) is 
 * shorthand for the if then else statement
 * eg.- variable = Condition? (if true then do) : (if false then do)
 */
public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myAge = 20;
		String checkAge = myAge==20 ? "I am 20 years old" : "I am not years old";
		System.out.println(checkAge);

	}

}
