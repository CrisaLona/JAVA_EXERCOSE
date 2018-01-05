package iches.science.chapter05;

public class ConditionSumTest {

	public static void main(String[] args) {
		int total =0 ;
		for (int n = 1; n <=30 ; n++) {
			if ((n % 2) != 0 && (n % 3) != 0) {
				total += n;
			}
		}
		System.out.println(total);

	}

}
