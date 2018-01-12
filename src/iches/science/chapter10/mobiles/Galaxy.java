package iches.science.chapter10.mobiles;

public class Galaxy extends Mobile implements GooPlay{
	private String osVersion;

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	@Override
	public void buy(String kind, int price) {
		System.out.println("Galaxy : " + kind + "앱을" + price + "원에 구입하였습니다.");
	}
}
