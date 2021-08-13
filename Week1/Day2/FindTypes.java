package assignment3;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char[] ch = test.toCharArray();
		int length = ch.length;
		for (int i = 0; i < length; i++) {

			if (Character.isLetter(ch[i])) {
				letter++;
			}
			if (Character.isWhitespace(ch[i])) {
				space++;
			}
			if (Character.isDigit(ch[i])) {
				num++;
			}
			if (!Character.isLetter(ch[i]) && !Character.isWhitespace(ch[i]) && !Character.isDigit(ch[i])) {
				specialChar++;
			}
		}

		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}
