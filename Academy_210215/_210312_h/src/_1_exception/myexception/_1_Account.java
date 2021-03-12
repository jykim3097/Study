package _1_exception.myexception;

public class _1_Account {
	
	/*
	 * 1. 접근제한자를 붙이세요
	 * 2. withDraw()에서 잔액이 출금보다 작다면, 
	 *    MyException으로 예외를 발생시키고 처리하는 코드를 작성해주세요
	 */
	private String name;
	private String password;
	private int balance; //잔액
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	//잔액 조회
	public int getBalance() {
		return balance;
	}

	public _1_Account(String pName, String pPW, int pBalance) {
		name = pName;
		password = pPW;
		balance = pBalance;
	}
	
	//입금
	public void deposit(int money) {
		balance += money;
	}
	
	//출금
	public void withDraw(int money) throws MyException {
		
		if(balance < money) {
			throw new MyException("잔액이 부족합니다.");
		}
		balance -= money;
	}
	
}
