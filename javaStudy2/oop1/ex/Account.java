package oop1.ex;

public class Account {
	
	int balance = 0;
	
	
	
	
	int deposit(int bill) {
		
		return balance += bill;
	}
	
	int withdrow(int bill ) {
		
		if(balance < bill) {
			
			System.out.println("잔액부족");
			return balance;
		} else {
		return balance -= bill;
		}
	}
	
	void status() {
		System.out.println("잔고: "+ balance);
	}
	
	
}
