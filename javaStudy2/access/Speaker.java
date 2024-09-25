package access;

public class Speaker {
	
	int volume;
	
	Speaker(int volume){
		
		this.volume = volume;
	}
	
	void volumeUp() {
		
		if(volume >= 100) {
			System.out.println("최대 볼륨. 더이상 증가할 수 없습니다.");

		} else {
			System.out.println("음량이 10 증가합니다.");
			volume += 10;
		}
	}
	
	 void volumeDown() {
		if(volume < 10) {
			System.out.println("최소 볼륨");
		} else {
			System.out.println("음량이 10 감소합니다.");
		 volume -= 10;
		}
	}
	 
	 void showVolume() {
		 System.out.println("현재 볼륨: " + volume);
	 }
	 

}
