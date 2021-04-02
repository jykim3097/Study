package _1_quiz02;

public class _1_Account {
	String name;
	String password;
	int balance;
	
	_1_Account(String pName, String pPW, int pBalance) {
		name = pName;
		password = pPW;
		balance = pBalance;
	}
	
	void deposit(int money) {
		balance += money;
	}
	
	void withDraw(int money) {
		balance -= money;
	}
	
	int getBalance() {
		return balance;
	}
}
