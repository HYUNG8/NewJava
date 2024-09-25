package pack;


import pack.a.*;

public class PackageMain2 {

	public static void main(String[] args) {
		
		Data data = new Data();					  
		User user = new User();     // 
		User2 user2 = new User2();  // import 의 클래스 부분에 '*'를 적으면 패키지 않의 모든 클래스를 사용할 수 있다.

	}

}

// import 를 사용한 덕분에 코드에서 패키지 명을 생략하고 클래스만 적을 수 있다.

// 작성 순서
// 맨 위 : package , 두번째 : import , 세번째 : class
