package operator;

public class operator2 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//변수 a의 값을 증가 시킬려면 a = a + 1 연산을 수행해야한다.
		
		int a = 0;
		
		a = a + 1;
		System.out.println("a = " + a); //1
		
		a = a + 1;
		System.out.println("a = " + a); //2
		
		//증감 연산자
		++a; //a = a + 1
		System.out.println("a = " + a); //3
		
		++a; //a = a+ 1;
		System.out.println("a = " + a); //4
		
		//a + a + 1 을 ++a로 간단하게 표현할 수 있는 것이 증감 연산자이다.
		
		//++(증가), --(감소)
		//값을 하나 감소할 때는 --a와 같이 표현하면 된다. 이것은 a = a - 1이 된다.
		
		
		//전위, 후위 증감연산자.
		// ++a : 변수를 먼저 증가시킨 후 작업을 수행한다.
		// --a : 작업을 머저 수행한 후 연산을 수한다.
		
		//전위 증감 연산자 
		int b = 1; 
	    int c = 0;
	    
	    c = ++b; // b의 값을 먼저 증가시키고, 그 결과를 b에 대입
	    System.out.println("b = "+ b + ", c = " + c);
	    
	    //후위 증감 연산자
	    b = 1;
	    c = 0;
	    
	    c = b++; // b의 현재 값을 c에 먼저 대입하고, 그 후 b의 값을 증가시킨다.
	    System.out.println("b = "+ b +", c = "+ c);
	    
	    
	    
	   
	}

}
