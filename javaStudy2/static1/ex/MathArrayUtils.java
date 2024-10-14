package static1.ex;

public class MathArrayUtils {
	
	

	public static int sum(int[] values) {
		
		int total = 0;
		for (int value : values) {
			
			total += value;
		}
		
		return total;
	}
	
	
	public static double average(int[] values) {
		
	return (double) sum(values)/ values.length;
	}
	
	public static int min(int[] values) {
		int minValue = values[0];
		
		for(int value : values) {
			if(minValue > value) {
				minValue = value;
			}
		}
		return minValue;
	}
	
	
	public static int max(int[] values) {
		
		int maxValue = values[0]; 
		
		for(int value : values) {
			if(value > maxValue) {
				maxValue = value;
			}
		}
		return maxValue;
	}

	
	// 인스턴스 생성을 막기 위해서 생성자를 private 로 한다.
	private MathArrayUtils() {
		
	}

}
