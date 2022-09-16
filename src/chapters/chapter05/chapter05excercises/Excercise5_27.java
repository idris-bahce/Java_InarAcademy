package chapters.chapter05.chapter05excercises;

public class Excercise5_27 {
	public static void main(String[] args) {
		int counter = 0;
		for (int i = 101; i < 2100; i++) {
			if (i % 4 == 0) {
				System.out.printf("%5d",i);
				counter++;

				if (counter % 10 == 0)
					System.out.println();
			}
		}
	}
}
