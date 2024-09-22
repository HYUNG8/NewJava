package oop1.ex;

public class AccountMain {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.deposit(10000);
		account.withdrow(9000);
		account.withdrow(2000);
		account.status();

	}

}
