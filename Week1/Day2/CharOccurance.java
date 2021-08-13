package assignment3;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		int count = 0;
		char[] ch = str.toCharArray();
		int length = ch.length;
		for (int i = 0; i < length; i++) {

			if (ch[i] == 'e') {
				count++;
			}
		}
		System.out.println(count);

	}

}
