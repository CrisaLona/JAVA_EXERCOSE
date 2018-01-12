package iches.science.chapter07;

public class PublicationTest2 {
	public static void main(String[] args) {
		Publication pub1 = new Publication();
		Publication pub2 = new Publication();
		
		Publication.printHeader();

		pub1.setPrice(5000);
		pub1.setTitle("만화 삼국지");
		pub1.setPage(300);
		
		pub2.setPrice(8400);
		pub2.setTitle("파이 이야기");
		
		System.out.println("출판물 정보 : " + pub1.getTitle() + " ( " + pub1.getPrice() + "원, "+ pub1.getPage()+ " page )");

	}
}
