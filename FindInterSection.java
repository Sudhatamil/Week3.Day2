package Week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindInterSection {

	public static void main(String[] args) {
		/*
		 
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		int arr1[]= {3,2,11,4,6,7};
		int arr2[]= {1,2,8,4,9,7};
		
		
		/**for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
					System.out.println(arr1[i]);
			}
		}**/
		List<Integer> lst1=new ArrayList<Integer>();
		List<Integer> lst2=new ArrayList<Integer>();
		
		Arrays.asList(arr1);
		Arrays.asList(arr2);
		
		for(int res1:arr1)
			lst1.add(res1);
		for(int res2:arr2)
			lst2.add(res2);
		
		for(int i=0;i<lst1.size();i++)
		{
			for(int j=0;j<lst2.size();j++)
			{
				if(lst1.get(i)==lst2.get(j))
					System.out.println(lst1.get(i));
			}
		}
	}
}


