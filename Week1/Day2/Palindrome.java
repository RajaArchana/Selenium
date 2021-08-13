package assignment3;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "respect";
		char[] ch = text.toCharArray();
		String reverse = "";
		for (int i = ch.length-1; i >= 0; i--) {
			reverse = reverse + ch[i];
		}
		if (text.equals(reverse)) {
			System.out.println("The given input is palindrome");
		} else {
			System.out.println("The given input is not palindrome");
		}

	}

}
