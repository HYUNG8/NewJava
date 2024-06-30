package method;

public class MethodEx3 {

	public static void main(String[] args) {
		
		int balance = 10000;
		
		 balance = depositAmount(1000, balance);
		 balance = withrawAmount(2000, balance);
		 
		 System.out.println("최종 잔액: " + balance + "원");
		 
		 
	}
	
	public static int  depositAmount (int depositAmount,int balance ) {
		
		balance += depositAmount;
		System.out.println(depositAmount + "원을 입급하셨습니다. 현재 잔액: " + balance + "원");
		return balance;
		
	}
	
	public static int withrawAmount (int withrawAmount, int balance) {
		if (balance >= withrawAmount) {
			balance -=withrawAmount;
			System.out.println(withrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
			return balance;
		} else {
			System.out.println(withrawAmount + "원을 출금하려했으나 잔액이 부족합니다. 현재 잔액: " + balance + "원");
			return balance;
		}
	}
	
	
	
	
	
}
