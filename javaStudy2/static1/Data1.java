package static1;

public class Data1 {
	
	public String name;
	
	public int count;

	public Data1(String name) {
		
		this.name = name;
		count++;
		
	}

}


//객체를 생성할 때마다 Data1 의 객체는 새로 만들어진다. 그리고 인스턴스에 포함된 count 변수도 새로 만들어진다.