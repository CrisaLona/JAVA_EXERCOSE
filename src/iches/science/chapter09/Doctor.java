package iches.science.chapter09;

public class Doctor {
	private String name;
	private String department;
	
	public Doctor(String name, String department) {
		this.name = name;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}
	
	void treatPatient() {
		System.out.println("ȯ�ڸ� �����մϴ�.");
	}
}
