package loop;

public class Break2 {

	public static void main(String[] args) {
		
		
		int sum = 0;
		int i = 1;
		for(;;) {
			sum += i;
			if(sum >10) {
				System.out.println("i는 "+ i + "처음으로 sum이 10이 넘는 값은 "+ sum);
				break;
			}
			i++;
		}
		
	

	}

}
