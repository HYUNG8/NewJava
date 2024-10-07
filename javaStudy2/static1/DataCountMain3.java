package static1;

public class DataCountMain3 {

	public static void main(String[] args) {
		
		Data3 data1 = new Data3("A");
		System.out.println("A count: " + Data3.count);

		Data3 data2 = new Data3("B");
		System.out.println("B count: " + Data3.count);
		
		Data3 data3 = new Data3("C");
		System.out.println("C count: " + Data3.count);
		
		
		
		// 추가
		// 인스턴스를 통한 접근
		Data3 data4 = new Data3("D");
		System.out.println("D count: " + data4.count);	 // 인스턴를 통애서 이동하여 스태틱 변수이면 스태틱 영역의 변수를 찾는다.
														 
		// 정적 변수의 경우 인스턴스를 통한 접근은, 코드를 읽을때 인스턴스 변수에 접근하는 것으로 오해할 수 있기 때문에 추천하지 않는다.
		// 정적 변수는 클래스에서 공용으로 관리하기 때문에 클래스를 통해서 접근하는 것이 더 명확하다.
		
		// 클래스를 통한 접근
		System.out.println("D count: " + Data3.count);
	}

}

// static 이 붙은 변수는 인스턴스가 생성되는 힙영역이 아닌 메서드 영역에서 관리한다.
// Data3("A") 인스턴스를 생성하면 count++코드가 있는 생성자가 호출된다.
// count 는 정적 변수다. 정적 변수는 인스턴스 영역이 아니라 메서드 영역에서 관리하기 때문에 메서드 영역에 있는 count 의 값이 증가한다.


// 스태틱 변수에 접근하려면 클래스명 + .(dot) + 변수명으 접근하면 된다.


//  변수와 생명주기

// 지약변수(매개변수 포함): 지역변수는 스택영역에 있는 스택 프레임 안에 보관된다. 메서드가 종료되면 스택 프레임도 제거되느데,
// 이때 해당 스택프레임에 포함된 지역변수도 제거된다. 따라서 지역 변수는 생명주기가 짧다.

// 인스턴스 변수: 인스턴스에 있는 멤버변수를 인스턴스 변수라 한다. 인스턴수 변수는 힙영역을 사용한다. 힙 영역은 가비지컬렉션이 발생하기 전까지 생존한다.
// 보통 지역변수 보다 생존 주기가 길다.

// 클래스 변수: 클래스 변수는 메서드 영역의 static 영역에 보관되는 변수이다. 메서드 영역은 프로그램 전체에서 사용하는 공용 공간이다.
// 클래스 변수는 해당 클래스가 JVM에 로딘 되는 순간 생성된다. 그리고 JVM이 종료될 때 까지 생명주기가 이어진다. 따라서 긴 생명주기를 가진다.

