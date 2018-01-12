package iches.science.chapter07;

import java.util.Scanner;

import iches.science.chapter06.Building;
import iches.science.chapter06.Car;

//import iches.science.chapter06.*;

public class BuildingTest {
	public static void main(String[] args) {
		Building b1 = new Building();
		Car c1 = new Car();
	}
	public static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}
}
