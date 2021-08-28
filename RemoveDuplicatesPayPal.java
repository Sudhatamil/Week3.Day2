package Week3.Day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesPayPal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="PayPal";
char[] ch=name.toCharArray();
Set<Character> charset=new LinkedHashSet<Character>();
Set<Character> dupCharset=new LinkedHashSet<Character>();
for(char originalcharset:ch)
{
	boolean unique=charset.add(originalcharset);
	if(unique==false)
		dupCharset.add(originalcharset);
	
}

System.out.println("Duplicate characters:"+dupCharset);
charset.removeAll(dupCharset);
System.out.println("Unique characters:"+charset);
	}

}
