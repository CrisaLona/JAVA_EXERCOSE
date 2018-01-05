package iches.science.chapter05;

public class SumAndAverageTest {

	public static void main(String[] args) {
		int total = 0;
		int roof = 0;
		for (int n = 1; n <= 500; n++) {
			total += n;
			roof = n;
			
		}
		
		double average = total / roof ;
		System.out.println("ÇÕ°è : " + total);
		System.out.println("Æò±Õ : " + average);

	}

}
