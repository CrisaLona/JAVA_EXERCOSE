package iches.science.chapter08;

public class ScoreArryTest {
	public static void main(String[] args) {
		int [] scores = {93, 87, 90};
		String [] subject = {"����","����", "����"};
		double avg = 0.0;
		int sum = 0;
		

		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
			System.out.println(subject[i] + " : " + scores[i]);
		}
		avg =(double)(sum / scores.length);
		
/*		System.out.println("���� : " + scores[0]);
		System.out.println("���� : " + scores[1]);
		System.out.println("���� : " + scores[2]);*/
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
	}
}
