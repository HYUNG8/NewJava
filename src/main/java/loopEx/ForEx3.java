package loopEx;

public class ForEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int max = 10;
		System.out.println("max 는 " + max);
		for (int i = 1; i <= max; i++) {
			sum += i ;
			System.out.println("i = "+ i + ", sum = " + sum);
		}
	}

}
