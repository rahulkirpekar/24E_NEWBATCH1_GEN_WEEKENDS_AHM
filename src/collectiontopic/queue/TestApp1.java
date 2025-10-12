package collectiontopic.queue;

import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Natural Ordering
		PriorityQueue<String> queue = new PriorityQueue<>();
		
		queue.add("rahul");
		queue.add("ankur");
		queue.add("brijesh");
		queue.add("sagar");
		queue.add("ramesh");
		
		// Natural Ordering
		while(!queue.isEmpty()) 
		{
			String name= queue.poll();
			System.out.println(name);
		}
	}
}
