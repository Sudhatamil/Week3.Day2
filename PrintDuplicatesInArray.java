package Week3.Day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		// declare an int variable named count
		/**
		 * int count; // iterate from 0 to the array length-1 (outer loop starts here)
		 * for (int i = 0; i < alength-1; i++) { // assign 0 to count count=0; //
		 * iterate from i to the length of the array by adding 1 to it (inner loop
		 * starts here) for (int j = i+1; j < alength; j++) { // compare both the loop
		 * variables & check they're equal
		 * 
		 * 
		 * if(arr[i]==arr[j]) { // increase the count if both the arrays are equal
		 * count++; } } if(count>0) System.out.println(arr[i]); }
		 **/

		Set<Integer> duplicate = new HashSet<Integer>();
		Arrays.asList(arr);
		for (int res : arr)
			duplicate.add(res);
		System.out.println(duplicate);

	}

}
