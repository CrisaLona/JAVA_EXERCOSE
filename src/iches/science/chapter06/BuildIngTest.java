package iches.science.chapter06;

public class BuildIngTest {
	public static void main(String[] args) {
		Building build1 = new Building();
		build1.name = "������Ÿ��";
		build1.address = "���";
		build1.totalfloor = 5;
		
		System.out.println("�ǹ��� : " + build1.name);
		System.out.println("�ּ� : " + build1.address);
		System.out.println("���� : " + build1.totalfloor);
		
		build1.moveElevator();
		build1.changeAddress("������");
		System.out.println("������");
		System.out.println("�ǹ��� : " + build1.name);
		System.out.println("�ּ� : " + build1.address);
		System.out.println("���� : " + build1.totalfloor);
	}
}
