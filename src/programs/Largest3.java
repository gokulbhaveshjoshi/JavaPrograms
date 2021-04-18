package programs;

public class Largest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, 3, 8, 10, 2 ,15,71,25,36,108,3,96,98};
		int first = 0, second = 0, third = 0;
		for (int i : a) {
			
			// check for first number
			if (first < i) {
				int temp = first;
				first = i;
				third = second;
				second = temp;
			}
			
			// check for second number
			if (first > i && second < i) {
				int temp = second;
				second = i;
				third = temp;
			}
			
			// check for third number
			if ((first > i && second < i) && third < i) {
				third = i;
			}

		}

		System.out.println("first: " + first + " second : " + second + " third " + third);
	}
}