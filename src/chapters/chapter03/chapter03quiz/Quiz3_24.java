package chapters.chapter03.chapter03quiz;

public class Quiz3_24 {
	public static void main(String[] args) {

		int a = (int) (Math.random() * 100) % 13;
		int b = (int) (Math.random() * 100) % 4;

		switch (a) {
		case 0:
			if (b == 0) {
				System.out.println("The card you picked is Ace of Clubs");
			} else if (b == 1) {
				System.out.println("The card you picked is Ace of Diamonds");
			} else if (b == 2) {
				System.out.println("The card you picked is Ace of Hearts");
			} else {
				System.out.println("The card you picked is Ace of Spades");
			}
			break;
		case 1:
			if (b == 0) {
				System.out.println("The card you picked is 2 of Clubs");
			} else if (b == 1) {
				System.out.println("The card you picked is 2 of Diamonds");
			} else if (b == 2) {
				System.out.println("The card you picked is 2 of Hearts");
			} else {
				System.out.println("The card you picked is 2 of Spades");
			}
			break;
		case 2:
			if(b==0) {
				System.out.println("The card you picked is 3 of Clubs");
			}else if(b==1) {
				System.out.println("The card you picked is 3 of Diamonds");
			}else if(b==2) {
				System.out.println("The card you picked is 3 of Hearts");
			}else {
				System.out.println("The card you picked is 3 of Spades");
			}
			break;
		case 3:
			if(b==0) {
				System.out.println("The card you picked is 4 of Clubs");
			}else if(b==1) {
				System.out.println("The card you picked is 4 of Diamonds");
			}else if(b==2) {
				System.out.println("The card you picked is 4 of Hearts");
			}else {
				System.out.println("The card you picked is 4 of Spades");
			}
			break;
		case 4:
			if(b==0) {
				System.out.println("The card you picked is 5 of Clubs");
			}else if(b==1) {
				System.out.println("The card you picked is 5 of Diamonds");
			}else if(b==2) {
				System.out.println("The card you picked is 5 of Hearts");
			}else {
				System.out.println("The card you picked is 5 of Spades");
			}
			break;
		case 5:
			if(b==0) {
				System.out.println("The card you picked is 6 of Clubs");
			}else if(b==1) {
				System.out.println("The card you picked is 6 of Diamonds");
			}else if(b==2) {
				System.out.println("The card you picked is 6 of Hearts");
			}else {
				System.out.println("The card you picked is 6 of Spades");
			}
			break;
		case 6:
			if(b==0) {
				System.out.println("The card you picked is 7 of Clubs");
			}else if(b==1) {
				System.out.println("The card you picked is 7 of Diamonds");
			}else if(b==2) {
				System.out.println("The card you picked is 7 of Hearts");
			}else {
				System.out.println("The card you picked is 7 of Spades");
			}
			break;
		case 7:
			if(b==0) {
				System.out.println("The card you picked is 8 of Clubs");
			}else if(b==1) {
				System.out.println("The card you picked is 8 of Diamonds");
			}else if(b==2) {
				System.out.println("The card you picked is 8 of Hearts");
			}else {
				System.out.println("The card you picked is 8 of Spades");
			}
			break;
		case 8:
			if(b==0) {
				System.out.println("The card you picked is 9 of Clubs");
			}else if(b==1) {
				System.out.println("The card you picked is 9 of Diamonds");
			}else if(b==2) {
				System.out.println("The card you picked is 9 of Hearts");
			}else {
				System.out.println("The card you picked is 9 of Spades");
			}
			break;
		case 9:
			if(b==0) {
				System.out.println("The card you picked is 10 of Clubs");
			}else if(b==1) {
				System.out.println("The card you picked is 10 of Diamonds");
			}else if(b==2) {
				System.out.println("The card you picked is 10 of Hearts");
			}else {
				System.out.println("The card you picked is 10 of Spades");
			}
			break;
		case 10:
			if(b==0) {
				System.out.println("The card you picked is Jack of Clubs");
			}else if(b==1) {
				System.out.println("The card you picked is Jack of Diamonds");
			}else if(b==2) {
				System.out.println("The card you picked is Jack of Hearts");
			}else {
				System.out.println("The card you picked is Jack of Spades");
			}
			break;
		case 11:
			if(b==0) {
				System.out.println("The card you picked is Queen of Clubs");
			}else if(b==1) {
				System.out.println("The card you picked is Queen of Diamonds");
			}else if(b==2) {
				System.out.println("The card you picked is Queen of Hearts");
			}else {
				System.out.println("The card you picked is Queen of Spades");
			}
			break;
		default:
			if(b==0) {
				System.out.println("The card you picked is King of Clubs");
			}else if(b==1) {
				System.out.println("The card you picked is King of Diamonds");
			}else if(b==2) {
				System.out.println("The card you picked is King of Hearts");
			}else {
				System.out.println("The card you picked is King of Spades");
			}
		}

	}
}
