package iches.science.chapter10.animals;

public class Bird extends Animal implements Flyable {
	public Bird(String kind, int age,String habitat) {
		
	}
	private String habitat;
	
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public void fly() {
		System.out.println("���ư���.");
	}
	public void spreadWings() {
		System.out.println("������ ��ģ��.");
	}
	

}
