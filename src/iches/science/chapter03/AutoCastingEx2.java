package iches.science.chapter03;

public class AutoCastingEx2 {

	public static void main(String[] args) {
		double number = 10000000000000.2424;
		long longNumber = (long)number;
		int intNumber = (int)longNumber;
		
		System.out.println(number);
		System.out.println(longNumber);
		System.out.println(intNumber);

	}

}
