package loop;

public class While1_1 {

	public static void main(String[] args) {
		
		int count = 0;
		
		count = count + 1;
		System.out.println("현재 숫자는 " + count);
		count = count + 1;
		System.out.println("현재 숫자는 " + count);
		count = count + 1;
		System.out.println("현재 숫자는 " + count);
		
		
		// while
		
		count = 0;
		
		while (count < 3) {
			++count;
			System.out.println("현재 숫자는 " + count);
		}
		
		
		
		
		
		
		
		
		
		
		int count2 = 0;
		for (int i = 0 ; i < 4; i++ ) {
			count2 = i;
			System.out.println("현재 숫자는 " + count2);
		}
		
		int count3 = 0;
		for (count3 = 0 ; count3 < 4; count3++ ) {
			System.out.println("현재 숫자는 " + count3);
		}
	}

}
