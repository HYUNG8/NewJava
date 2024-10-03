package access.ex;

public class MaxCountMain {

	public static void main(String[] args) {
		
		MaxCounter count = new MaxCounter(3);
		
		count.increment();
		count.increment();
		count.increment();
		count.increment();
		
	
		System.out.println("count : " + count.getCount());

	}

}
