package iches.science.chapter07;

public class Book {
	String title;
	String author;
	int price;
	
/*	Book() {
		
	}*/
	
	Book(String author) {
		this.author = author;
	}
	
	Book(String title, String author) {
		this(author);
//		this.title = title;
		this.author = author;
	}

	Book(String title, String author,int price) {
		this(title, author);
//		this.title = title;
//		this.author = author;
		this.price = price;
	}
}
