package programs;

public class TimeComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p = 0, n = 4;
		int x = 1;
		
		for(int i =0; i<=n; i++) {
			p++;
			for(int j=(n/2); j<=n; j++) {
				p++;
				for(int k = 1; k<=n; k=k*2) {
					p++;
					
					System.out.println(x + " value of i "+ i + " value of j "+j+" value of k "+ k + "No of iteration "+ p);
					x++;
				}
			}
		}
		
		System.out.println(p);
		int result = ((x-1)/(n+1));
		System.out.println("Time Complexity is "+result );

	}

}
