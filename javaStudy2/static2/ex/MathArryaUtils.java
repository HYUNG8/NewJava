package static2.ex;

public class MathArryaUtils {

	private  MathArryaUtils() {
		// 생성자에 프라이트를 하면 인스턴스를 생성할 수 없다.
		// 인스턴스 생성을 막고, 스태틱메서드를 유도할 수 있다.
	}

	public static int sum(int[] values) {
		int total = 0;
		for( int value : values) {
			total += value;
		};
		
		return total;
	}

	public static double average(int[] values) {

		return  (double) sum(values) / values.length;
	}

	public static int min(int[] values) {
		int minValue = values[0];
		for(int value : values) {
			if(value < minValue) {
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

}
