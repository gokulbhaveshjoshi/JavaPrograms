package string;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String();
		s1 = "Hello";
		String s3 = "Hello";
		String s2 = "Hello";
		System.out.println("s1 hashcode "+ s1.hashCode());
		System.out.println("s2 hashcode "+ s2.hashCode());
		System.out.println("s3 hashcode "+ s3.hashCode());
		s2 = "hello";
		System.out.println("s2 hashcode "+ s2.hashCode());
		if(s1.equals(s2)) {
			System.out.println("equals");
		}
		if(s1.equals(s3)) {
			System.out.println("s1 and s3 are equals");
		}
		if(s2.hashCode() == s1.hashCode()) {
			System.out.println("hash code");
		}
		if(s2.hashCode() == s1.hashCode()) {
			System.out.println(" s1 and s2 have same hash code");
		}
		if(s3.hashCode() == s1.hashCode()) {
			System.out.println(" s1 and s3 have same hash code");
		}
		if(s2 == s1) {
			System.out.println(" s1 and s2 ==");
		}
		if(s3 == s1) {
			System.out.println(" s1 and s3 have ==");
		}

	}

}
