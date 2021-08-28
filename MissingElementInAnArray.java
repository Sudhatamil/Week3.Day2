package Week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
			
		// Sort the array	
	/**	Arrays.sort(arr);
	
		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = arr[0]; i <= arr.length; i++) {
			
			// check if the iterator variable is not equal to the array values respectively
			if(i!=arr[i-1])
			{
				System.out.println("MissingElement:"+i);
				break;
			}**/
			// print the number
			// once printed break the iteration
		
		List<Integer> res=new ArrayList<Integer>();
		Arrays.asList(arr);
		
		for(int element:arr)
			res.add(element);
		Collections.sort(res);
		for(int i=1;i<res.size();i++)
		{
			if(i!=res.get(i-1))
			{		
				System.out.println("Missing Element:"+i);
				break;
			}
		}

			
			
			
				
				
	}

}
