package iches.science.chapter10;

public class PolyPersonTest {
	public static void main(String[] args) {
		Person [] p1 = {new Person(), 
				new Student("ȫ�浿", "123", "�İ���"), 
				new Teacher("����ġ", "124","Java")};
		
		p1[0].sleep();
		p1[1].sleep();
		p1[2].sleep();
		p1[0].eat();
		p1[1].eat();
		p1[2].eat();
		
		((Student)p1[1]).study();
		((Teacher)p1[1]).teach();
		
	}
}
