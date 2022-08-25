package chapters.chapter03.chapter03checkpoints;

public class CheckPoint3_14 {
	public static void main(String[] args) {
		int number;
		number = 30;

		if (number % 2 == 0)
			System.out.println(number + " is even");
		if (number % 5 == 0)
			System.out.println(number + " is multiple of 5");

		if (number % 2 == 0)
			System.out.println(number + " is even");
		else if (number % 5 == 0)
			System.out.println(number + " is multiple of 5");
		//Output of 14 is "14 is even, 14 is even"
		//output of 15 is "15 is multiple of 5, 15 is multiple of 5"
		//output of 30 is "30 is even, 30 is multiple of 5; 30 is even"

}
}
