package iches.science.chapter09;

public class AnimalTest {
	public static void main(String[] args) {
		Cat c1 = new Cat(3, "페르시안","야옹이");
		Dog d1 = new Dog(2, "시베리안허스키", "멍멍이");
		
/*		c1.setName("야옹이");
		c1.setKind("페르시안");
		c1.setAge(3);*/
		
/*		System.out.println("이름 : " + c1.getName());
		System.out.println("나이 : " + c1.getAge());
		System.out.println("종류 : " + c1.getKind());*/
		
		c1.run();
		c1.hunt();
		c1.play();
		
		d1.run();
		d1.hunt();
	}
}
