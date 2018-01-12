package iches.science.chapter10;

public class PolyPersonTest {
	public static void main(String[] args) {
		Person [] p1 = {new Person(), 
				new Student("홍길동", "123", "컴공과"), 
				new Teacher("전우치", "124","Java")};
		
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
