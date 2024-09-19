package oop1;

public class MusicPlayerMain4 {

	public static void main(String[] args) {
		
		MusicPlayer player = new MusicPlayer();

		
		// 음악 플레이어 켜기
		player.on();
		// 볼륨 증가
		player.volumeUp();
		// 볼륨 증가
		player.volumeUp();
		// 볼륨 감소
		player.volumeDown();
		// 음악 플레이어 상태
		player.status();
		// 음악 플레이어 종료
		player.off();
		
	

	}
}

// 캡슐화
// 속성과 기능을 하나로 묶어서 필요한 기능을 외부에 제공하는 것을 캡슐화라 한다.


// 객체 지향 프로그래밍 덕분에 플에이어 객체를 사용하는 입장에서 진짜 음악 플레이어를 만들고 사용하는 것 처럼 느껴진다.
// 그렇기 때문에 코드를 더 읽기 쉬운 것은 물론이고, 속성과 기능이 한 곳에 있기 때문에 변경도 더 쉬워진다. 