package scope;

public class Scope3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//temp가  if문 안에서만 사용된다.
		
		int m = 10;
		
		if (m > 0 ) {
			int temp = m * 2;
			System.out.println("temp = " + temp);
		}
		System.out.println("m = " + m);

	}
	
	
	// for, while
	// for문은 for문 안에서만 사용하는 변수를 만들 수 있지만, while문은 그렇지 않다. 
	

}
