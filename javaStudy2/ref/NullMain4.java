package ref;

public class NullMain4 {

	public static void main(String[] args) {
		
		BicData bicData = new BicData();
		bicData.data =  new Data(); // data에 참조값을 주면 해결할 수 있다.
		System.out.println("BicDta.Count = " + bicData.count); 
		System.out.println("BicDta.data = " + bicData.data);   
		
		
		System.out.println("BicDta.data.value = " + bicData.data.value); // 

	}

}

