package assignment15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionMissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] data = { 0, 1, 2, 3, 4, 7, 6, 8 };
		int length = data.length;
		List<Integer> list = Arrays.asList(data);
		Collections.sort(list);
		for (int i = 0; i < length; i++) {
			if (data[i] != i) {
				System.out.println("The Missing element in an array Using collection "+ i);
				break;
			}
		}

	}
}
