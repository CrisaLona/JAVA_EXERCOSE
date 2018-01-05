package iches.science.chapter05;

public class ChangeWhileTest {
	public static void main(String[] args) {
		int i = 1;

		while (i <= 10) {
			int n = 1;
			while (n <= i) {
				System.out.print("*");
				n++;
			}
		
			i++;
			System.out.println();
		}
		
	}

}
