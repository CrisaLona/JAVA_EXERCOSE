package iches.science.chapter10;

public class Teacher extends Person {
	private String subject;
	
	public Teacher(String name, String phone, String subject) {
		super(name, phone);
		this.subject = subject;
	}
	
	public void teach() {
		System.out.println("����ġ��.");
	}
//	@Override
	public void eat() {
//		super.eat();
		System.out.println("�Բ� ���� �Դ�.");
	}
}
