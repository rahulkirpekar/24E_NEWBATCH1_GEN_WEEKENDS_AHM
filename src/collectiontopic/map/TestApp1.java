package collectiontopic.map;

import java.util.Map;
import java.util.TreeMap;

public class TestApp1 
{
	public static void main(String[] args)
	{
		// HashMap---------Not Maintain Insertion Order of Key
		// LinkedHashMap---Maintain Insertion Order
		// TreeMap---------Ascending Order Sorting on Key
		
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
//		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		
		map.put(11, "Rahul");// [Key,Value]----ENTRY
		map.put(2, "Ankur");
		map.put(32, "Sagar");
		map.put(14, "Brijesh");
		map.put(5, "Rakesh");

		for(Map.Entry<Integer, String> e : map.entrySet()) 
		{
			int key = e.getKey();		 
			String value = e.getValue();
			
			System.out.println(key+" " + value);
		}
	}
}
