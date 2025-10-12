package collectiontopic.list;

import java.util.ArrayList;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		
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
		
		System.out.println("--------------------------------------");
		list.set(2, "Rakesh Patel");// update by index

		for (int i = 0; i < list.size(); i++) 
		{
			String name= list.get(i);
			System.out.println(name);
		}
	}
}
