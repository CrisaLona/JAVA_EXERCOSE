package iches.science.chapter09;

public class Animal {
	private int age;
	private String kind;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public Animal(int age, String kind) {
		this.age = age;
		this.kind = kind;
	}
	public void run() {
		System.out.println("달려라!!!");
	}
	public void hunt() {
		System.out.println("쥐를 잡을 거야");
	}

}
