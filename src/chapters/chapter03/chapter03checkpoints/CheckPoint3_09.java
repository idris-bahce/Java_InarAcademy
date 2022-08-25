package chapters.chapter03.chapter03checkpoints;

public class CheckPoint3_09 {
	public static void main(String[] args) {
		int x = 3;
		int y = 3;
		if (x > 2)
			if (y > 2) {
			int z = x + y;
			System.out.println("z is " + z);
			}
			else
			System.out.println("x is " + x);
	}
	// Nothing happened when we made x=2, y=3
	//when we made x=3 and y=2 output is:x is 3
	//when we made x=3 and y=3 output is:z is 6
}
