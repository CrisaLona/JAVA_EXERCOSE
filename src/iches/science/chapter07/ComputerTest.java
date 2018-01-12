package iches.science.chapter07;

public class ComputerTest {
	public static void main(String[] args) {
		Computer r500 = new Computer("R500", "win 7", 100);
		r500.printComputerInfo();
		
		Computer r570 = new Computer("R570", "win 10", 200, 30);
		r570.printComputerInfo();
	}
}
