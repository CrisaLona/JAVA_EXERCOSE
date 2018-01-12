package iches.science.chapter08;

public class Account {
	private String number;
	private int balance;
	private double interestRate;
	
	public Account(String number, int balance, double interestRate) {
		this.number = number;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public String getNumber() {
		return number;
	}
	public int getBalance() {
		return balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
/*	int calculateInterest(){
		int interest =(int)(balance * interestRate / 100);
		return interest;
	}*/
	void calculateInterest() {
		int interest =(int)(balance * interestRate / 100);
		balance += interest;
	}
}
