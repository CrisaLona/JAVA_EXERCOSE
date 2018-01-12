package iches.science.chapter08;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "abc";  // str1과 2는 heap 공간을 공유, new 는 아예 새로운 객체 생성.
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc1");
		
		if(str1 == str2) {
			System.out.println("두 객체는 같습니다.");
		} if (str3 == str4) {
			System.out.println("두 객체는 같습니다.");
		} else {
			System.out.println("두 객체는 다릅니다.");
		} if (str1 == str4) {
			System.out.println("두 객체는 같습니다.");
		} else {
			System.out.println("두 객체는 다릅니다.");
		} if (str1.equals(str4)) {
			System.out.println("같은 글자입니다.");
		} else {
			System.out.println("다른 글자입니다.");
		}
	}
}
