package iches.science.chapter07;

public class Magazine {
	private String name;
	private int price;
	
	void printProductInfo( ) {
		System.out.println(name + " : " + price );
	}

	public Magazine(String name, int price) {
		this.name = name;
		this.price = price;
	}
	void setName(String name) {
		this.name = name ;
	}
	void setPrice(int price) {
		this.price = price;
	}
	String getName() {
		return name;
	}
	int getPrice() {
		return price;
	}
	
}
