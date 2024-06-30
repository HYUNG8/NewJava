package scope;

public class Scope3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m = 10;
		int temp = 0;
		
		if (m > 0 ) {
			temp = m * 2;
			System.out.println("temp = " + temp);
		}
		System.out.println("m = " + m);
	}

	// 위 코드의 문제점
	
	// 비효율 적인 메모리 사용
	// temp 변수는 if문 안에서만 사용되지만, main메서드가 종료될때까지 메모리에 유지된다. 
	// if문 안에 temp를 선언했다면 효율적으로 메모리를 하용할 수 있다.
	
	// 코드의 복잡성 증가
	// if문 안에 temp를 선언했다면 if문이 끝나고 더이상 temp변수를 신경쓸 필요가 없다.
	// 유지보수를 할 때 m과 temp를 계속해서 신경써야한다. 
	
}
