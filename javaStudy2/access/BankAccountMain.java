package access;

public class BankAccountMain {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		
		account.deposit(10000);
		account.withdraw(3000);
		
		System.out.println("balance = " + account.getBalance());
	}

}

// 캡슐화
// 캡슐화는 데이터와 해당 데이터를 처리하는 메서드를 하나로 묶어서 외부에서의 접근을 제한하는 것을 말한다.
// 캡슐화를 통해서 데이터의 직접적인 변경을 방지하거나 제한할 수 있다.


// 1.데이터를 숨겨라 
// 캡슐화에서 가장 필수로 숨겨햐하는 것은 속성(데이터)이다.
// 객체 내부의 데이터를 외부에서 함부로 접근하게 두면, 클래스 안에서 데이터를 다루는 모든 로직을 무시하고 데이터를 변결할 수 있게 된다.
// 객체의 데이터는 객체가 제공하는 기능인 메서드를 통해서 접근해야한다.

// 2. 기능을 숨겨라
// 객체의 기능 중에서는 외부에서 사용하지 않고 내부에서만 사용하는 기능들이 있다. 이러한 기능은 모두 숨기는 것이 좋다.
// 사용자 입장에서 꼭 필요한 기능만 외부에 노출하자

// 정리하면 데이터는 모두 숨기고, 기능은 꼭 필요한 기능만 노출하는 것이 좋은 캡슐화이다.

