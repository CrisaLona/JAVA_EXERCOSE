package iches.science.chapter06;

public class Car {
	int oilAmount;
	double driveDistance;
	
	void addOil(int newOil) {
		oilAmount += newOil;
		System.out.println("휘발유 " + newOil + "L 주유합니다.");
	}
	void driveCar(String start, String end, double distance) {
		System.out.println(start +  "에서 " + end + "까지 " + distance +"km 주행하였습니다.");
		driveDistance += distance;
		oilAmount -= distance / 20;
		// oilAmount =(int) oilAmount - distance / 20;
		
	}
	void carInfo() {
		System.out.println("[ICE 카~} 남은 기름 양 : " + oilAmount + "L" + ", 총 주행거리 : " + driveDistance + "km");
		
	}
	double calculateDrivingDistance() {
		double distance = 0.0;
		distance = oilAmount * 20;
		return distance;
	}

}
