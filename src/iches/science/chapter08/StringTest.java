package iches.science.chapter08;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "abc";  // str1�� 2�� heap ������ ����, new �� �ƿ� ���ο� ��ü ����.
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc1");
		
		if(str1 == str2) {
			System.out.println("�� ��ü�� �����ϴ�.");
		} if (str3 == str4) {
			System.out.println("�� ��ü�� �����ϴ�.");
		} else {
			System.out.println("�� ��ü�� �ٸ��ϴ�.");
		} if (str1 == str4) {
			System.out.println("�� ��ü�� �����ϴ�.");
		} else {
			System.out.println("�� ��ü�� �ٸ��ϴ�.");
		} if (str1.equals(str4)) {
			System.out.println("���� �����Դϴ�.");
		} else {
			System.out.println("�ٸ� �����Դϴ�.");
		}
	}
}
