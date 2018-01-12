package iches.science.chapter10;

public class CarTest {
	public static void main(String[] args) {
		Car [] cars = {new Car(), new Taxi(), new Truck()	};

		cars[0].wash();

		cars[1].wash();

		cars[2].wash();
		
		
		/*		for (int i = 0; i < cars.length; i++) {
			cars[i].setOilSize(10);
		}
		
		for (int i = 0; i < cars.length; i++) {
			cars[i].go(20);
		}
		cars[0].setOilSize(10);
		cars[0].go(20);
		((Taxi)cars[0]).setMaxNum(4);
		System.out.println("택시 정원 : " + ((Taxi)cars[0]).getMaxNum() + "명"); 
		
		cars[1].setOilSize(10);
		cars[1].go(30);
		
		((Truck)cars[1]).setMaxWeight(100);
		System.out.println("트럭 최대 적재량 : " + ((Truck)cars[1]).getMaxWeight() + "kg");
				*/
	}
}
