package method;

public class MethodEx {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		int c = 3;
		
		System.out.println("평균값: "+ average(a,b,c));
		System.out.println("평균값: "+ average(1,2,3)); // 변수 선언도 안해된다.
		
		
		int x = 15;
		int y = 25;
		int z = 35;
		
		System.out.println("평균값: "+ average(x,y,z));

		

	}
	
	public static double average(int a,int b,int c) {
		int sum = a + b + c;
		return  sum / 3.0;
	}
	
	
	
	
	/* 내가 작성한 코드
	 * 
	 *
	 * public static void main(String[] args) {
	 * 
	 * int a = 1; int b = 2; int c = 3;
	 * 
	 * int sum = add(a,b,c); average(sum);
	 * 
	 * 
	 * int x = 15; int y = 25; int z = 35;
	 * 
	 * sum = add(x,y,z); average(sum);
	 * 
	 * 
	 * 
	 * }
	 * 
	 * public static int add(int a, int b, int c) { int sum = a + b + c; return sum;
	 * }
	 * 
	 * public static void average (double sum) { double average = sum / 3.0;
	 * System.out.println("평균값: "+ average); }
	 */
}
