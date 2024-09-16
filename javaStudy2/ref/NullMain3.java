package ref;

public class NullMain3 {

	public static void main(String[] args) {
		
		BicData bicData = new BicData();
		System.out.println("BicDta.Count = " + bicData.count); // 0
		System.out.println("BicDta.data = " + bicData.data);   // null
		
		
		System.out.println("BicDta.data.value = " + bicData.data.value); // NullPointerException

	}

}

// BicData를 생성하면 BicData의 인스턴스가 생성된다. 이때 BicData 인스턴스의 멤버변수에 초기화가 일어나는데
// BicData의 data 멤버변수는 참조형이므로 null로 초기화된다. count 멤버변수는 숫자이므로 0으로 초기화된다.

// 예외 발생 생성 과정
// bicData.data.value 
// x100.data.value      // bicData는 x001참조값을 가진다.
// null.value           // x001.data는 null을 가진다
// NullPointerException // null	값에 .(dot)을 찍으면 예외가 발생한다.
