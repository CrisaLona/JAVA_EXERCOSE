package iches.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int num = 456;
		int hundNum = num / 100;
		int decNum = (num % 100) / 10;
		int loneNum = (num % 100) % 10;
		// int decNum = (num - hundNum*100) /10;
		// int loneNum = (num -hundNum * 100-decNum*10);
		
		System.out.println("���� : " + num);
		System.out.println("���� �ڸ� �� : " + hundNum);
		System.out.println("���� �ڸ� �� : " + decNum);
		System.out.println("���� �ڸ� �� : " + loneNum);
	}

}
