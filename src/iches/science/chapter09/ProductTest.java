package iches.science.chapter09;

public class ProductTest {
	public static void main(String[] args) {
		Product p1 = new Product("�뵹��", 450000, 8);
		Television t1 = new Television("�ó׸� TV", 3500000, 10, "ȭ��ũ�� 151cm");
		
		
		System.out.println("========��ǰ ����=========");
		p1.printProductInfo();
		System.out.println("----------------------------------------");
		t1.printProductInfo();
		System.out.println("��� : " + t1.getDescription() );
		
		System.out.println("[����] �������� ��� 15%�� �����մϴ�.");
		p1.setDiscountRate(15);
		t1.setDiscountRate(15);
		
		System.out.println(p1.getName() + " �ǸŰ� : " + p1.calculateDiscountPrice());
		System.out.println(t1.getName() + " �ǸŰ� : " + t1.calculateDiscountPrice());
	}
}
