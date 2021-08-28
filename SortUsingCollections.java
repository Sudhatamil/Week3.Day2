package Week3.Day2;


import java.util.Set;
import java.util.TreeSet;

public class SortUsingCollections {

	public static void main(String[] args) {
		
	String[] companies= {"Google","Microsoft","TestLeaf","Maverick"};
	
	Set<String> set =new TreeSet<String>();
	
	for(String company : companies)
		
	{
		set.add(company);	
	}
		
	System.out.println(set);
	

	}

}
