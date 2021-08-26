package assignment15;

import java.util.LinkedHashSet;

public class CollectionRemoveDuplicates {

	public static void main(String[] args) {
		String str = "PayPal India";
		LinkedHashSet<Character> value = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			value.add(str.charAt(i));
		}
		for (Character ch : value)
			System.out.print(ch);
	}

}
