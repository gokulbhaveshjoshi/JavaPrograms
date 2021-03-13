package operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 7;
		 System.out.println("a&b = " + (a & b));
		 
		 //bitwise or
		 System.out.println("a|b = "+ (a|b));
		 
		 
		 //bitwise xor
		 System.out.println("a^b = "+(a ^ b));
		 
		 //bitwise and
		 //will gives 2's complement
		 System.out.println("~a = "+ ~a);
		 
		 // we can acheive with assignment operant 
		 // a=a&b
		 a&=b;
		 System.out.println("a= "+a);
	 

	}

}
