package iches.science.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		int totalSum = 0;
		int evenSum = 0;
		int oddSum = 0;
		for (int n = 1; n <= 1000; n++) {
			totalSum += n;
			if ((n % 2) == 0) { 
				evenSum += n;
			}else {
				oddSum += n;
			}
			/*if ((n % 2) == 1) {
				oddSum += n;
			}*/
		}
		System.out.println("1���� 1000������ �� : " + totalSum);
		System.out.println("1���� 1000���� ¦������ �� : " + evenSum);
		System.out.println("1���� 1000���� Ȧ������ �� : " + oddSum);

	}

}
