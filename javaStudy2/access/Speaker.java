package access;

public class Speaker {
	
	// int volume; //  private 가 없어서 외부에서 접근이 가능하다.
	private int volume; // private 가 있어서 외부에서 접근이 불가능하고 내부 메서드를 통해서만 접근이 가능하다.
	
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
