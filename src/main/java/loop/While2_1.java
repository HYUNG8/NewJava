package loop;

public class While2_1 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		while(i < 4) {
			 sum = sum + i ;
			System.out.println("i는 " + i + ", sum은 "+ sum);
			++i;
		}
		
		sum = 0;
		i = 11;
		while(i < 14) {
			sum = sum + i ;
			System.out.println("i는 " + i + ", sum은 "+ sum);
			++i;
		}
		

	}

}
