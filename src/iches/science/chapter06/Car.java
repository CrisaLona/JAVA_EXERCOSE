package iches.science.chapter06;

public class Car {
	int oilAmount;
	double driveDistance;
	
	void addOil(int newOil) {
		oilAmount += newOil;
		System.out.println("�ֹ��� " + newOil + "L �����մϴ�.");
	}
	void driveCar(String start, String end, double distance) {
		System.out.println(start +  "���� " + end + "���� " + distance +"km �����Ͽ����ϴ�.");
		driveDistance += distance;
		oilAmount -= distance / 20;
		// oilAmount =(int) oilAmount - distance / 20;
		
	}
	void carInfo() {
		System.out.println("[ICE ī~} ���� �⸧ �� : " + oilAmount + "L" + ", �� ����Ÿ� : " + driveDistance + "km");
		
	}
	double calculateDrivingDistance() {
		double distance = 0.0;
		distance = oilAmount * 20;
		return distance;
	}

}
