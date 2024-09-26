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
		speaker.volume = 200;
		speaker.showVolume();
		
		// 메서드에서 필드의 값에 100이라는 제한을 두었지만 
		// 필드에 직접 접근해서 값을 변경하게 되면 제한을 무시하고 원하는 값을 설정할 수 있게 된다.
		// 이러한 문제를 근본적으로 해결하기 위해서는 필드의 외부 접근을 막을 수 있는 방법이 필요하다.
		

	}
	

}
