package iches.science.chapter09;

public class AccountTest {
	public static void main(String[] args) {
		FundAccount fundAcc1 = new FundAccount("111-2222", "È«±æµ¿", 5000000, 4.7);
		FundAccount fundAcc2 = new FundAccount("666-7777", "È«±æ¼ø", 1000000, 2.9);

		fundAcc1.openAccount();
/*		fundAcc.openAccount();
		System.out.println("°èÁÂ¹øÈ£ : " + fundAcc.getNumber());
		System.out.println("¿¹±ÝÁÖ : " + fundAcc.getName());
		System.out.println("ÀÜ¾× : " + fundAcc.getBalance());
		System.out.println("¼öÀÍ·ü : " + fundAcc.getEarningRate() + "%");*/
		fundAcc1.earnMoney();
		System.out.println();
		fundAcc2.openAccount();
		fundAcc2.earnMoney();
	}
}
