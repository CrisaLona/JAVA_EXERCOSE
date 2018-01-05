package iches.science.chapter05;

public class ValuationBasisTest {

	public static void main(String[] args) {
		int firstNo = 10;
		int secondNo = 20;
		int thirdNo = 40;
		int forthNo = 50;
		int fifthNo = 80;
		
		double result = 0;
		result += (double)firstNo * secondNo / 2 * 6 / 10;
		result += (double)(thirdNo + forthNo) / 2 * 13 / 100;
		result += (double)fifthNo * 27 /100;
		
		System.out.println("평가 점수 : " + result);
		
		if (result <= 100 && result >= 95) {
			System.out.println("Special Class");
		}else if (result < 95 && result >= 90) {
			System.out.println("Special Class");
		}else if (result < 90 && result >= 85) {
			System.out.println("Special Class");
		}else if (result < 85 && result >= 80) {
			System.out.println("Special Class");
		}else {
			System.out.println("Member");
		}
	}
}