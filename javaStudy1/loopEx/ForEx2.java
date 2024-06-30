package loopEx;

public class ForEx2 {

	public static void main(String[] args) {
		
		int num = 2;
		
		for (int i = 1;  i <= 10; i++) {
			System.out.println(num);
			num = num + 2; 
		}
		
		
		for(int num2 = 2, j = 1;  j<=10;num2 += 2, j++ ) {
			System.out.println(num2);
		}

	}

}
