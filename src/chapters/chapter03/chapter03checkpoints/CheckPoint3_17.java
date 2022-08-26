package chapters.chapter03.chapter03checkpoints;

public class CheckPoint3_17 {
	public static void main(String[] args) {
		double income;
		double tax;
		income=15000;
		 
		if (income <= 10000) {
			tax = income * 0.1;
		}else if (income <= 20000) {
			tax = 1000 + (income - 10000) * 0.15;
			System.out.println(tax);
			}
		
		if (income <= 10000) {
			tax = income * 0.1;
		}else if (income > 10000 &&
			income <= 20000) {
			tax = 1000 +
			(income - 10000) * 0.15;
			System.out.println(tax);
			}
		//So as it seems they are same
		}

}
