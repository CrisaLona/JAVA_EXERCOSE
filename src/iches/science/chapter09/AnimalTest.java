package iches.science.chapter09;

public class AnimalTest {
	public static void main(String[] args) {
		Cat c1 = new Cat(3, "�丣�þ�","�߿���");
		Dog d1 = new Dog(2, "�ú������㽺Ű", "�۸���");
		
/*		c1.setName("�߿���");
		c1.setKind("�丣�þ�");
		c1.setAge(3);*/
		
/*		System.out.println("�̸� : " + c1.getName());
		System.out.println("���� : " + c1.getAge());
		System.out.println("���� : " + c1.getKind());*/
		
		c1.run();
		c1.hunt();
		c1.play();
		
		d1.run();
		d1.hunt();
	}
}
