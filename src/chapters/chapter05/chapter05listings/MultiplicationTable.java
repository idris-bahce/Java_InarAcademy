package chapters.chapter05.chapter05listings;

public class MultiplicationTable {
	public static void main(String[] args) {
		System.out.println("\t\t\t\tMULTIPLICATION TABLE");
		for (int i = 0; i < 10; i++) {
			System.out.print("\t" + i + "");
		}
		System.out.println("\n-------------------------------------------------------------------------------------");
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " |");
			for (int j = 0; j < 10; j++) {
				System.out.print("\t" + j * i);
			}
			System.out.println();
		}

	}
}
