package assignment15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionFindSecondLargest {

	public static void main(String[] args) {
		Integer[] data = { 3, 2, 11, 4, 6, 7 };
		int length = data.length;
		List<Integer> list = Arrays.asList(data);
		Collections.sort(list);
		int largestNum = list.get(length - 2);
		System.out.println("The second largest number in an array Using collection "+ largestNum);
	}

}
