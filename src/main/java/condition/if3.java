package condition;

public class if3 {

	public static void main(String[] args) {
		
		
		//if문과 else if문
		//if문에 else if문을 사용할때는 서로 연관된 조건일 경우이다.
		//서로 관련 없는 조건이면 if문만을 각각 따로 작성한다.
		
		//예시
		//동시에 할인 받을 수 있는 조건
		// -아이템 가격이 10000원 이상일 때, 1000원 할인
		// -나이가 10 이하일 때 100원 할인
		
		
	   int price = 10000;
	   int age = 10;
	   int discount = 0;
	   
	   
	   if(price >= 10000) {
		   discount =+ 1000;
	   }
	   if(age <= 10) {
		   discount =+1000;
	   }
	   
	    price = price - discount;
	    System.out.println("총 지불금액:"+price+"원");
	}

}
