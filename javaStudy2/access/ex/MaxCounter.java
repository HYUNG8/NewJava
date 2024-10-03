package access.ex;

public class MaxCounter {
	
	private int count = 0;
	private int max;
	
	MaxCounter(int max){
		
		this.max = max;
	}
	
	public void increment() {
		
		// 검증
		if(max <= count) {
			System.out.println("max값을 초과할 수 없습니다.");
			return;
		} 
		
		// 실행로직
		++count;
		
	}
	
	public int getCount() {
		return count;
	}
	
	
		
}
