package example2;

public class Example {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.setAcc_no(1234567898);
		b.setName("The Stylish Coder");
		b.setEmail("TheStylishCoder.com");
		b.setAmount(5807f);
		
		 System.out.println(b.getAcc_no()+" "+b.getName()+" "+b.getEmail()+" "+b.getAmount());  

	}

}
