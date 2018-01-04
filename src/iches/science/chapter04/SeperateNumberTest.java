package iches.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int num = 456;
		int hundNum = num / 100;
		int decNum = (num % 100) / 10;
		int loneNum = (num % 100) % 10;
		// int decNum = (num - hundNum*100) /10;
		// int loneNum = (num -hundNum * 100-decNum*10);
		
		System.out.println("숫자 : " + num);
		System.out.println("백의 자리 수 : " + hundNum);
		System.out.println("십의 자리 수 : " + decNum);
		System.out.println("일의 자리 수 : " + loneNum);
	}

}
