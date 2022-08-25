package chapters.chapter03.chapter03checkpoints;

public class CheckPoint3_10 {
	public static void main(String[] args) {
		
		int score;
		
		score =85;				
		
		if (score >= 60.0)
			System.out.println("D");
			else if (score >= 70.0)
			System.out.println("C");
			else if (score >= 80.0)
			System.out.println("B");
			else if (score >= 90.0)
			System.out.println("A");
			else
			System.out.println("F");
		// It does't go further than D even if the score is 95.
	}

}
