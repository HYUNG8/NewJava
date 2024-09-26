package access;

public class SpeakerMain {

	public static void main(String[] args) {
		
		Speaker speaker = new Speaker(80);
		
		speaker.volumeUp();
		speaker.volumeUp();
		speaker.showVolume();
		
		speaker.volumeDown();
		speaker.showVolume();
		
		speaker.volumeUp();
		speaker.showVolume();
		
		speaker.volumeUp();
		
		
		// 필드에 직접 접근
		System.out.println("volume 필드 직접 접근 수정");
		// speaker.volume = 200; // volume 필드에 private가 없으면 필드를 직접 변경할 수 있다.
		speaker.showVolume();
		
		// 메서드에서 필드의 값에 100이라는 제한을 두었지만 
		// 필드에 직접 접근해서 값을 변경하게 되면 제한을 무시하고 원하는 값을 설정할 수 있게 된다.
		// 이러한 문제를 근본적으로 해결하기 위해서는 필드의 외부 접근을 막을 수 있는 방법이 필요하다.
		
		// 접근제어자 종류
		// private : 모든 외부 호풀을 막는다.
		// default(package-private) : 같은 패키지 안에서의 호출은 허용한다.
		// protected : 같은 패키지 안에서의 호출은 허용한다. 패키지가 달라도 상속 관계의 호출은 허용한다.
		// public : 모든 외부 호출은 허용한다.
		
		// 접근제어자 사용 위치
		// 접근 제어자는 필드와 메서드, 생성자에 사용된다.
		// 추가로 클래스 레벨에도 일부 접근 제어자를 사용할 수 있다.
		
		// 접근 제어자의 핵심은 속성과 기능을 외부로부터 숨기는 것이다.
		// private : 나의 클래스 안으로 속성과 기능을 숨길 때 사용한다. 외부 클래스에서 해당 기능을 호출할 수 다.
		// default : 나의 패키지 안으로 속성과 기능을 숨길 때 사용한다. 외부 패키지에서 해당 기능을 호출할 수 없다.
		// protected : 상속 관계로 속성과 기능을 숨길 때 사용, 상속 관계가 아닌 곳에서 해당 기능을 호출할 수 없다.
		// public : 기능을 숨기지 않고 어디서든 호출할 수 있게 공개한다.
		
		
		
		

	}
	

}
