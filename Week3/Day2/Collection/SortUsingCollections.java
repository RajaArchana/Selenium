package assignment15;

import java.util.Arrays;
import java.util.Collections;

public class SortUsingCollections {

	public static void main(String[] args) {
		String[] value = { "Google", "Microsoft", "TestLeaf", "Maverick" };

		int length = value.length;
		System.out.println("the length of the array---" + length);
		Arrays.sort(value);
		Collections.reverse(Arrays.asList(value));
		System.out.println("Reversed Array:" + Arrays.asList(value));

	}

}
