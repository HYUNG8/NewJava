package static1;

public class DecoMain1 {

	public static void main(String[] args) {
		
		String s = "hello Java";
		DecoUtil1 util1 = new DecoUtil1();
		
		String deco = util1.deco(s);
		
		System.out.println( "변환 전: " + s);
		System.out.println( "변환 후: " + deco);
	}

}
