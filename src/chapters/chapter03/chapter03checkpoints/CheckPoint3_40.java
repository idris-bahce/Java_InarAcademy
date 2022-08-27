package chapters.chapter03.chapter03checkpoints;

public class CheckPoint3_40 {
	public static void main(String[] args) {
		int x = 8;
		
		System.out.println((x > 0 && x < 10));
		System.out.println(((x > 0) && (x < 10)));
		//as we see they are same.
		
		System.out.println((x > 0 || x < 10));
		System.out.println(((x > 0) || (x < 10)));
		//as we see they are same.
		
		int y = -5;
		System.out.println((x > 0 || x < 10 && y < 0));
		System.out.println((x > 0 || (x < 10 && y < 0)));
		//They are same...
	}

}
