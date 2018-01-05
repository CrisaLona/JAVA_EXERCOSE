package iches.science.chapter05;

public class PrimeNumberTest {
	public static void main(String[] args) {
		int a =21;
		int b = 31;
		boolean c = true;
		
		for (int i = 2; c ; i++ ) {
			if ( i==a ) {
				System.out.println(a + "은 소수입니다."); break;
			}if ((a % i) == 0) {
				System.out.println(a + "은 소수가 아닙니다."); break;
			} 
		}
		for (int i = 2; c ; i++ ) {
			 if ( i==b ) {
					System.out.println(b + "은 소수입니다."); break;
				}if ((b % i) == 0) {
				System.out.println(b + "은 소수가 아닙니다."); break;
			}
		}
	}
}
