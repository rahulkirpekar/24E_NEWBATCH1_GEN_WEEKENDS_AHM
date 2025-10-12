package stringtopic.immutableway;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Immutableway
		String name1 = "royal";
		System.out.println(name1+"---"+name1.hashCode());
		
		// immutable
		name1= name1.concat("technosoft");// royaltechnosoft 
		
		System.out.println(name1+"---"+name1.hashCode());
	}
}
