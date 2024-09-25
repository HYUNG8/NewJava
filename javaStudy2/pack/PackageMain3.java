package pack;

import pack.a.User;
import pack.a.*;

public class PackageMain3 {

	public static void main(String[] args) {
		
		Data data = new Data();					  
		User user = new User();     // import 했으므로 풀경로를 적지 않아도 된다.
		

	}

}

// import 를 사용한 덕분에 코드에서 패키지 명을 생략하고 클래스만 적을 수 있다.

// 작성 순서
// 맨 위 : package , 두번째 : import , 세번째 : class
