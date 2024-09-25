package pack;

public class PackageMain1 {

	public static void main(String[] args) {
		
		Data data = new Data();					  // 사용자와 같은 패키지에 소속되어 있으므로 경로를 생략한다. 
		pack.a.User user = new pack.a.User();     // 다름 패키지에 있는 생성자를 호출하므로 풀네임(경로지정)을 해야한다.
		

	}

}
