package iches.science.chapter05;

import java.util.Scanner;

public class ScoreTest {
	public static void main(String[] args) {
		int total = 0;
		int roofUse = 0;

		System.out.print("���� �л� ����? : ");
		int people = getUserInput();
		for ( int roof = 0; roof < people; roof++) {
			System.out.print(roof + 1 + "�� ���� : ");
			total += getUserInput();
			roofUse=roof;
		}
		double average = total / roofUse;
		System.out.println("=======================");
		System.out.println(people + "���� ���� : "+ total + "��");
		System.out.println(people + "���� ��� : "+ average + "��");
		System.out.println("=======================");
	}
/*
		System.out.print("���� �л� ����? : ");
		int people = getUserInput();
		System.out.print("1�� ���� : ");
		int one = getUserInput();
		System.out.print("2�� ���� : ");
		int two = getUserInput();
		System.out.print("3�� ���� : ");
		int three = getUserInput();
		System.out.print("4�� ���� : ");
		int four = getUserInput();
		System.out.print("5�� ���� : ");
		int five = getUserInput();
		System.out.print("6�� ���� : ");
		int six = getUserInput();
		System.out.print("7�� ���� : ");
		int seven =getUserInput();
		System.out.print("8�� ���� : ");]
				int eight = getUserInput();
		System.out.println("=======================");
		System.out.println("8���� ���� : ");
		System.out.println("8���� ��� : ");
		System.out.println("=======================");
	}*/
	public static int getUserInput() {
        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }

}
