package iches.science.chapter03;

public class AutoCastingEx {

	public static void main(String[] args) {
		int number = 1000;
		long longNumber = number;
		double doubleNumber = longNumber;
		
		System.out.println(number);
		System.out.println(longNumber);
		System.out.println(doubleNumber);

	}

}
