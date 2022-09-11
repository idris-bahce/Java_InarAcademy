package weeks.week04;

public class OneLetterInEachString {

	public static void main(String[] args) {
		String str = "Inar Academy";
		String sum = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.toLowerCase().charAt(i);
			if (sum.contains("" + ch) == false) {
				sum += ch;

			}
		}
		System.out.println(sum);
	}



}
