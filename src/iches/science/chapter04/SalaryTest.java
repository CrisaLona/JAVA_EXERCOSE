package iches.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int monthSalary = 1000000;
		int bonus = monthSalary * 2 / 10 * 4;
		int yearSalary = monthSalary * 12;
		int bonusTax = bonus *55 / 1000;
		int yearSalaryTax = monthSalary *12 *1 / 10;
		int totalSalary = yearSalary + bonus - bonusTax - yearSalaryTax;
		
		System.out.println("���� : " + yearSalary + ", ���� ���� : " + ( yearSalary - yearSalaryTax));
		System.out.println("���ʽ� : " + bonus + ", ���� ���ʽ� : " + (bonus - bonusTax));
		System.out.println("���޾� : " + totalSalary);
		

	}

}
