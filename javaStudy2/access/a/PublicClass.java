package access.a;

public class PublicClass {

	public static void main(String[] args) {
		
		PublicClass publicClass = new PublicClass();
		DefaultClass1 class1 = new DefaultClass1();
		DefaultClass2 class2 = new DefaultClass2();

	}
	


}

class DefaultClass1{
	
}

class DefaultClass2{
	
}


//　클래스 레벨에서의 접근 제어자
// 클래스 레벨에서는 public, default 만 사용할 수 있다.
// private, pritected 는 사용할 수 없다. 

// public 클래스는 반드시 파일 이름과 같아야한다.
// 하나의 자바파일에 public 클래스는 하나만 등장할 수 있다.
// 하나의 자바파일에 default 클래스는 무한정 만들 수 있다.

// 패키지 위치는 꼭 맞추어 주어야 한다.
// 
