package loop;

public class Break1 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		while (true) {
			sum = sum + i;
			if (sum > 10) {
				System.out.println("i는 "+ i +", sum이 처음으로 10보다 큰 값은 " + sum);
				break;
			}
			i++;
		}

	}

}
