package iches.science.chapter10;

public class Car implements Washer {
	private int oilSize;

	public int getOilSize() {
		return oilSize;
	}

	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}
	
	public void go(int distance) {
		System.out.println(distance + "km �̵��մϴ�.");
		System.out.println("���� : " + oilSize );
	}
	
	public void wash() {
		System.out.println("�����մϴ�.");
	}
}