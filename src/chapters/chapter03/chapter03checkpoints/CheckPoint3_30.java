package chapters.chapter03.chapter03checkpoints;

public class CheckPoint3_30 {
	public static void main(String[] args) {
		int x = 3;
		int y = 3;

		switch (x + 3) {
		case 6:
			y = 1;
		default:
		y += 1;
		System.out.println(y);
		 //answer is2
		}
		
		
		
		if (x + 3 == 6) {
			y = 1;
		} else {
			y += 1;
		}
	}

}
