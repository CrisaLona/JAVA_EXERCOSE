package iches.science.chapter10.mobiles;

public class MobileTest {
	public static void main(String[] args) {
		
		GooPlay m1 = new Galaxy();
		m1.buy("게임", 1000);
		
/*		Mobile[] ms = {new Galaxy(), new IPhone()}; 
		
		ms[0].setProduction("Galaxy");
		ms[1].setProduction("IPhone");
		
//		System.out.print(ms[0].getProduction() + " : ");
		//Galaxy g1 = (Galaxy)ms[0];
		((Galaxy)ms[0]).setOsVersion("안드로이드 오레오");
		System.out.println(ms[0].getProduction() + " : " + ((Galaxy)ms[0]).getOsVersion());
		System.out.print("Galaxy : " );		
		ms[0].call(5);
		System.out.print("Galaxy : " );		
		ms[0].charge(30);
		
		((IPhone)ms[1]).setColor("흰색");
		System.out.print("IPhone : " );		
		System.out.println(((IPhone)ms[1]).getColor());
		System.out.print("IPhone : " );		
		ms[1].call(10);
		System.out.print("IPhone : " );		
		ms[1].charge(15);*/
	}
}
