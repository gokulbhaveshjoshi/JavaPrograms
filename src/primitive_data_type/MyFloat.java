package primitive_data_type;

//The float data type is a single-precision 32-bit floating-point.
//It should never be used for precise values such as currency.
//Default value: 0.0 (0.0f)

public class MyFloat {

	public static void main(String[] args) {
		float number = -45.3f;
		System.out.println(number);

	}

}

//Notice that, we have used -45.3f instead of -45.3in the above program. It's because -45.3 is a double literal.
//
//To tell the compiler to treat -45.3 as float rather than double, you need to use f or F.
