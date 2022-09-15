package chapters.chapter05.chapter05excercises;


public class Excercise5_19 {
	public static void main(String[] args) {
		int i = 8;
		int k = 64;
		int z = k - 1;
		int l = 2;
		while (i > 0) {

			for (int j = i; j > 0; j--) {
				System.out.print("    ");
			}
			for (int j = 1; j < l  ; j*=2) {
				System.out.printf("%4d",j);
			}
			for (int j2 = k; j2 > 0; j2*=2) {
				System.out.printf("%4d",j2);
			}

			System.out.println();
			i--;
			l*=2;
			k/=2;
		}
	
	}

}
