package assignment3;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] ch = test.toCharArray();
		int length = ch.length;
		for (int i = 1; i < length;i=i+2) {
			ch[i]=Character.toUpperCase(ch[i]);
		}
		System.out.println(new String(ch));

	}

}
