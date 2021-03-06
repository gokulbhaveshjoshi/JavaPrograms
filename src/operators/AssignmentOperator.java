package operators;

/*
 * Assignment Operators are used in java to assign value to variables
 */

public class AssignmentOperator {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int a = 4;
		int b = a;      // = operator
		
		
		System.out.println("+=: "+ (a+=b));  // a+=b => a = a+b
		System.out.println("-=: "+ (a-=b));  // a-=b => a = a-b
		System.out.println("*+=: "+ (a*=b)); // a*=b => a = a*b
		System.out.println("/=: "+ (a/=b));  // a/=b => a = a=a/b
		System.out.println("%=: "+ (a%=b));  // a%=b => a = a%b
		

	}

}
