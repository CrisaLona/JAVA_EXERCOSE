package iches.science.chapter10;

public class Taxi extends Car {
	private int maxNum;

	public int getMaxNum() {
		return maxNum;
	}
	
	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}

	@Override
	public void go(int distance) {
		System.out.println("�ýø� Ÿ�� " + distance + "km �̵��մϴ�.");
		System.out.println("���� : " + this.getOilSize());
	}
	public void wash() {
		System.out.println("�ý� : �����մϴ�.");
	}
}