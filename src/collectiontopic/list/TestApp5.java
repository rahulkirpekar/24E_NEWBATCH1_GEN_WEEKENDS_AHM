package collectiontopic.list;

import java.util.LinkedList;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("rahul");//0
		list.add("ankur");//1
		list.add("rakesh");//2
		list.add("brijesh");//3
		list.add("sagar");//4

		for (int i = 0; i < list.size(); i++) 
		{
			String name= list.get(i);
			System.out.println(name);
		}
		
		
	}
}
