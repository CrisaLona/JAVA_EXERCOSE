package iches.science.chapter05;

public class PrimeNumberTest {
	public static void main(String[] args) {
		int a =21;
		int b = 31;
		boolean c = true;
		
		for (int i = 2; c ; i++ ) {
			if ( i==a ) {
				System.out.println(a + "�� �Ҽ��Դϴ�."); break;
			}if ((a % i) == 0) {
				System.out.println(a + "�� �Ҽ��� �ƴմϴ�."); break;
			} 
		}
		for (int i = 2; c ; i++ ) {
			 if ( i==b ) {
					System.out.println(b + "�� �Ҽ��Դϴ�."); break;
				}if ((b % i) == 0) {
				System.out.println(b + "�� �Ҽ��� �ƴմϴ�."); break;
			}
		}
	}
}
