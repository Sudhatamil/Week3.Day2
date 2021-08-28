package Week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {

		// Here is the input
		int[] data = { 3, 2, 11, 4, 6, 7 };
		// 1) Arrange the array in ascending order
		/**
		 * Arrays.sort(data); //2) Pick the 2nd element from the last and print it
		 * System.out.println("Second Largest:"+data[data.length-2]);
		 **/

		List<Integer> slargest = new ArrayList<Integer>();
		Arrays.asList(data);
		for (int res : data)
			slargest.add(res);
		Collections.sort(slargest);
		System.out.println(slargest);

		System.out.println("FindSecondLargest:" + slargest.get(slargest.size() - 2));

	}

}
