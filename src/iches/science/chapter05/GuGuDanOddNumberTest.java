package iches.science.chapter05;

public class GuGuDanOddNumberTest {

	public static void main(String[] args) {
		int a = 2;

		while (a <=5 ) {
			int b = 1;
			if ((a % 2) ==1) {
				while (b <= 9) {
					System.out.println(a+" * "+b + " = "+(a*b));
					b = b+1;
				}
			}
			a++;
		}
	}

}
