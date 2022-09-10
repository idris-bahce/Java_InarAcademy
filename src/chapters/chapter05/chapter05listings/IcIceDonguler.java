package chapters.chapter05.chapter05listings;

public class IcIceDonguler {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int j2 = 0; j2 < 3; j2++) {
					count++;
					System.out.println(count + ". hello" + " i: " + i + " j:" + j + " j2: " + j2);
				}
			}
		}
	}

}
