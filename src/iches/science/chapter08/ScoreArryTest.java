package iches.science.chapter08;

public class ScoreArryTest {
	public static void main(String[] args) {
		int [] scores = {93, 87, 90};
		String [] subject = {"국어","영어", "수학"};
		double avg = 0.0;
		int sum = 0;
		

		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
			System.out.println(subject[i] + " : " + scores[i]);
		}
		avg =(double)(sum / scores.length);
		
/*		System.out.println("국어 : " + scores[0]);
		System.out.println("영어 : " + scores[1]);
		System.out.println("수학 : " + scores[2]);*/
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
