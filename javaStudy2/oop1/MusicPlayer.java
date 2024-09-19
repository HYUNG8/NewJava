package oop1;

public class MusicPlayer {

	
	int volume = 0;
	boolean isOn = false;
	
	 void on() {
		isOn = true;
		System.out.println("음악 플레이어를 시작합니다.");
	}
	
	 void off( ) {
		isOn = true;
		System.out.println("음악 플레이어를 종료합니다.");
	}
	
	 void volumeUp( ) {
		volume++;
		System.out.println("음악 플에이어 볼륨: " + volume );
	}
	
	 void volumeDown( ) {
		volume--;
		System.out.println("음악 플에이어 볼륨: " + volume );
	}
	 void status( ) {
		System.out.println("음악 플에이어 상태 확인");
		
		if(isOn) {
			System.out.println("음악 플레이어 On ,볼륨: " + volume );
		} else {
			System.out.println("음악 플에이어 Off;");
		}
	}
}

// 뮤직플에이어에서 필요한 속성과 기능을 하나의 클래스에 모두 정의하였다.
