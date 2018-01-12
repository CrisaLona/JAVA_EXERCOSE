package iches.science.chapter06;

public class OverLoadingTest {
	public static void main(String[] args) {
		OverLoading over = new OverLoading();
		over.addition(1, 2);
		over.addition(2, 3.1);
		over.addition("ab", "cd");
	}
}
