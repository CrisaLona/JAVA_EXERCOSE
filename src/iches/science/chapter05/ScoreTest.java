package iches.science.chapter05;

import java.util.Scanner;

public class ScoreTest {
	public static void main(String[] args) {
		int total = 0;
		int roofUse = 0;

		System.out.print("반의 학생 수는? : ");
		int people = getUserInput();
		for ( int roof = 0; roof < people; roof++) {
			System.out.print(roof + 1 + "번 점수 : ");
			total += getUserInput();
			roofUse=roof;
		}
		double average = total / roofUse;
		System.out.println("=======================");
		System.out.println(people + "명의 총점 : "+ total + "점");
		System.out.println(people + "명의 평균 : "+ average + "점");
		System.out.println("=======================");
	}
/*
		System.out.print("반의 학생 수는? : ");
		int people = getUserInput();
		System.out.print("1번 점수 : ");
		int one = getUserInput();
		System.out.print("2번 점수 : ");
		int two = getUserInput();
		System.out.print("3번 점수 : ");
		int three = getUserInput();
		System.out.print("4번 점수 : ");
		int four = getUserInput();
		System.out.print("5번 점수 : ");
		int five = getUserInput();
		System.out.print("6번 점수 : ");
		int six = getUserInput();
		System.out.print("7번 점수 : ");
		int seven =getUserInput();
		System.out.print("8번 점수 : ");]
				int eight = getUserInput();
		System.out.println("=======================");
		System.out.println("8명의 총점 : ");
		System.out.println("8명의 평균 : ");
		System.out.println("=======================");
	}*/
	public static int getUserInput() {
        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }

}
