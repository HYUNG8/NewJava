package ref;

public class VarChange1 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = a;
		
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		
		//a 변경
		System.out.println("a값 20으로 변경");
		
		a = 20;
		
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		
		//b 변경
		System.out.println("b값 30으로 변경");
		
		b = 30;
		
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		
		
	}
}
