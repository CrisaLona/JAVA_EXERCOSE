package iches.science.chapter05;

import java.util.Scanner;

public class DutchCalculator {
	public static int getUserInput() {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input ;
	}
	public static void main(String[] args) {
		int totalSum =0;
		int memNo = 0;
		
		System.out.print("모임은 몇차까지 진행되었나요? ");
		int timeNo = getUserInput();
		System.out.println("=====================");
		for (int i = 1; i <= timeNo ; i++) {
			System.out.print(i + "차비용 : ");
			totalSum += getUserInput();
		}
		System.out.println("총 비용은 " + totalSum + "원 입니다.");
		System.out.println("=====================");
		System.out.print("모임의 인원수를 입력하세요 : ");
		memNo = getUserInput();
		int avgMoney = (totalSum / memNo);
		
		System.out.println("=====================");
		System.out.println("더치페이 금액은?" );
		for (int i = 1; i <=memNo ; i++) {
			if (i == memNo) {
				System.out.println(i + " : " + totalSum + "원");
				
			} else {
				totalSum -=avgMoney;
				System.out.println(i + " : " + avgMoney + "원");
			}
		}
		

	}

}
