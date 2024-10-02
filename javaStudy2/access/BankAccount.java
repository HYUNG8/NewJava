package access;

public class BankAccount {
	
	private int balance;
	
	public BankAccount() {
		balance = 0;
		
	}
	
	// public 메서드 deposit
	
	public void deposit(int amount) {
		if(isAmountValid(amount)){
			balance += amount;
		} else {
			System.out.println("유효하지 않은 금액입니다.");
		}
	}
	
	// public 메서드 withdraw
	public void withdraw(int amount) {
		if(isAmountValid(amount) && balance - amount >= 0) {
			balance -= amount;
		} else {
			System.out.println("유효하지 않은 금액입니다.");
		}
	}
	
	// public 메서드 getBalace
	public int  getBalance() {
		return balance;
	}
	
	// 내부에서만 사용하기 때문에 private
	private boolean isAmountValid(int amount) {
		return amount > 0;
	}
}
