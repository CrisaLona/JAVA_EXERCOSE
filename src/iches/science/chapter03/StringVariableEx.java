package iches.science.chapter03;

class StringVariableEx {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		String mathScore = "96";
		int intMathScore = Integer.parseInt(mathScore);
		int engScore = 82;
		
		
		System.out.println("�̸� : "+ name );
		System.out.println("�������� : "+ intMathScore );
		System.out.println("�������� : " + engScore );
		System.out.println("�հ����� : " + ( engScore + intMathScore ) );
		System.out.println(intMathScore + engScore + "��");
		
		
		
	}

}