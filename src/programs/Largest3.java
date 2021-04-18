package programs;

public class Largest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,3,8,10,2};
		int first = 0, second =  0, third = 0;
		for (int i : a) {
			if(first<i) {
				int temp = first;
				first = i;
				third = second;
				second = temp;
			}
			
			if(first > i && second < i) {
				int temp = second;
				second = i;
				third = second;
			}
			
			if((first > i && second < i) && third < i) {
				third = i;
			}
			

		}
		
		System.out.println("first: "+ first+" second : "+ second+" third "+third);
	}
}