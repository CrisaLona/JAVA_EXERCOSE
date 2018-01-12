package iches.science.chapter08;

public class MaxMinTest {
	public static void main(String[] args) {
		 int [] arr = {12, 53, 24, 10, 22, 38, 64, 39};
		 int max = arr[0];
		 int min = arr[0];
		 
		 System.out.print("배열 데이터 : ");
		 
		 for (int i = 0; i < arr.length; i++) {
			int roof = 0;
			int unroof = 0;
			System.out.print(arr[i] + ", ");
			for (int k = 0; k < arr.length; k++) {
				if(arr[i] > arr[k]) {
					roof++;
				} else {
					unroof++;
				}
			}
			if(roof == 7) {
				System.out.println();
				System.out.println("최대값 : " + arr[i]);
			} else if (unroof == 7) {
				System.out.println();
				System.out.println("최소값 : " + arr[i]);
			}
		 }
		 
	}
}
