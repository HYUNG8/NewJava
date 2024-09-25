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
		
		
		// 필드에 접근
		System.out.println("volume 필드 접근 수정");
		speaker.volume = 200;
		speaker.showVolume();
		
		

	}
	

}
