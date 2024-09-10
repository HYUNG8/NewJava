package ref;

public class NullMain1 {

	public static void main(String[] args) {
		
		Data data = null;
		System.out.println("1.data = " + data);
		
		data = new Data();
		System.out.println("2.data = " + data);
		
		data = null;
		System.out.println("3.data = " + data);

	}

}

// 바비지 컬렉터(GC) - 아무도 참조하지 않는 인스턴스의 최후
// 아무도 사용하지 않는 인스턴스는 메모리만 차지할 뿐이다.
// 자바는 이런 인스턴스가 있으면 JVM의 CG가 더이상 사용하지 않는 인스턴스라 판단하고
// 인스턴스를 CG를 사용하여 자동으로 메모리에서 제거해준다.

// 객제는 해당 객체를 사용하는 곳이 있으면 JVM이 종료할 때까지 생존한다.