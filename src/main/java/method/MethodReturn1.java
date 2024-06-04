package method;

public class MethodReturn1 {

	public static void main(String[] args) {
		
		odd(1);
		System.out.println(odd(5));

	}
	
	public static boolean odd(int a) {
		
		if(a % 2 == 1) {
			return true;
		}else {
			return false;
		}
	}

}
