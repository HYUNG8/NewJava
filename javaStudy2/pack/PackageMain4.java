package pack;

import pack.a.User;
import pack.a.*;

public class PackageMain4 {

	public static void main(String[] args) {
		
		User userA = new User();
		
		pack.b.User UserB = new pack.b.User();
		
		
		// 서로 다른 패키지에 같은 이름의 클래스가 있다면 자주 사용하는 클래스를 import 하고
		// 나머지는 패키지를 포함한 전체 경로를 적어주면 된다.
		

	}

}


// 패키지 규칙
// 패키지의 이름과 위치는 폴더(디렉토리)와 같아야한다. (필수)
// 패키지의 이름은 모두 소문자를 사용하다.
// 패키지 이름의 앞 부부에는 일반적으로 회사의 도메인 이름을 거꾸로 사용한다.
// 예를 들어 [com.company.myapp]과 같이 사용한다.(관례)
// 필수는 아니지만 수많은 외부 라이브러리와 함께 사용하게되면 같은 패키지에 같은 클래스 이름이 존재할 수 있다.
// 도메인이름을 거꾸로 사용하면 이런 문제를 방지할 수 있다.
// 내가 오픈소스나 라이브러리를 만들어서 외부에 제공한다면 꼭 지키는게 좋다.
// 내가 만든 어플리케이션을 다른 곳에 공유하지 않고, 직접 배포한다면 문제가 되지 않는다.

// 패키지와 계층구조
// 패키지가 계층구조를 이루더라도 모든 패키지는 서로 다른 패키지이다.



