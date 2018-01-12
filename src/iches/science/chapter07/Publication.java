package iches.science.chapter07;

public class Publication {
	String title;
	int price;
	int page;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setPage(int page) {
		if(page < 0) {
			System.out.println("[ERROR] ������ ������ ������ �Է��� �� �����ϴ�.");
		}else {
		this.page = page;
		}
	}
	public int getPage() {
		return page;
	}
	public void setPrice(int price) {
		if(price < 0) {
			System.out.println("[ERROR] ���� ������ ������ �Է��� �� �����ϴ�.");
		}else {
		this.price = price;
		}
	}
	public int getPrice() {
		return price;
	}
	public static void printHeader() {
		System.out.println("==== ���� ���� ��ȸ ====");
	}
}
