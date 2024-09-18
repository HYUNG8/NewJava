package oop1;

public class MusicPlayerMain3 {

	public static void main(String[] args) {
		
		
		MusicPlayerData data = new MusicPlayerData();
		
		// 음악 플레이어 켜기
		on(data);
		// 볼륨 증가
		volumeUp(data);
		// 볼륨 증가
		volumeUp(data);
		// 볼륨 감소
		volumeDown(data);
		// 음악 플레이어 상태
		status(data);
		// 음악 플레이어 종료
		off(data);
		
	}

	static void on(MusicPlayerData data) {
		data.isOn = true;
		System.out.println("음악 플레이어를 시작합니다.");
	}
	
	static void off(MusicPlayerData data) {
		data.isOn = true;
		System.out.println("음악 플레이어를 종료합니다.");
	}
	
	static void volumeUp(MusicPlayerData data) {
		data.volume++;
		System.out.println("음악 플에이어 볼륨: " + data.volume );
	}
	
	static void volumeDown(MusicPlayerData data) {
		data.volume--;
		System.out.println("음악 플에이어 볼륨: " + data.volume );
	}
	static void status(MusicPlayerData data) {
		System.out.println("음악 플에이어 상태 확인");
		
		if(data.isOn) {
			System.out.println("음악 플레이어 On ,볼륨: " + data.volume );
		} else {
			System.out.println("음악 플에이어 Off;");
		}
	}
}

// 각각의 기능을 메서드로 만든 덕분에 각각의 기능이 모듈화 되었다.

// 모듈화
// 레고 블럭을 생각하면 된다. 필요한 블럭을 만들고 필요한 블럭을 꼽아서 사용할 수 있다.

// 모듈화의 장점.

// 중복제거.
// 로직중복이 제거되었다 같은 로직이 필요하면 해당 메서드를 여러번 호출하면 된다.

// 변경영향범위 
// 기능을 수정할 때, 해당 메서드 내부만 수정하면 된다.

// 메서드리름추가
// 메서드 이름을 통해 코드를 더 쉽게 이해할 수 있다.


// 절차지향 프로그래밍의 한계
// 우리가 작성한 코드는 데이터(MusicPlayerData)와 기능(각 메서드)가 분리되어있다.
// 데이터와 기능이 밀접하게 연결되어 있어서 데이터를 수정하게 될 경우 기능도 수정해야한다.
// 유지보수 관정에서 관리 포인트가 2곡으로 늘어난다.
