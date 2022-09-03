package chapters.chapter04.chapter04checkpoints;

public class CheckPoint4_24 {
	public static void main(String[] args) {
		System.out.printf("amount is %f %e\n", 32.32, 32.32);
		System.out.printf("%6b\n", (1 > 2));
		System.out.printf("%6s\n", "Java");
		System.out.printf("%-6b%s\n", (1 > 2), "Java");
		System.out.printf("%6b%-8s\n", (1 > 2), "Java");
		System.out.printf("amount is %5.2%% %5.4e\n", 32.327, 32.32);
	}

}
