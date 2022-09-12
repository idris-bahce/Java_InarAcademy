package weeks.week04;

public class PalindromInterwiev {
	public static void main(String[] args) {

		String str = "mehmem";
		int length = str.length();
		boolean isPalindrome = true;

		for (int i = 0, j = length - 1; i < j; i++, j--) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(j);
			if(ch1 != ch2) {
				isPalindrome = false;
			}
			
		}
		if (isPalindrome) {
			System.out.println(str +" is a palindrom.");
		}else {
			System.out.println(str +" is not a palindrom.");
		}
	
	}

}
