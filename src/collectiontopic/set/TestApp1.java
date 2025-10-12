package collectiontopic.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Set---Not Allow Duplicate Values
		//  |
		// HashSet--------- Not Maintain Insertion Order
		// LinkedHashSet---Maintain Insertion Order
		// TreeSet---------Ascending Order Sorting 
		
//		HashSet<String> settObj = new HashSet<String>();
//		LinkedHashSet<String> settObj = new LinkedHashSet<String>();
		
		TreeSet<String> settObj = new TreeSet<String>();
		
		settObj.add("sagar");
		settObj.add("ramesh");
		settObj.add("brijesh");
		settObj.add("kunal");
		settObj.add("rahul");
		settObj.add("ankur");
		settObj.add("sagar");
		settObj.add("ramesh");
		settObj.add("brijesh");
		settObj.add("kunal");

		Iterator<String> itr = settObj.iterator();
		
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			System.out.println(name);
		}
	}
}