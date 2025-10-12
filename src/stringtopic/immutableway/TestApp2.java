package stringtopic.immutableway;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		//			   01234
		String name = "royal";// length - 5
		System.out.println("name.length() : " +name.length());// 5

		for (int i = 0; i < name.length(); i++) 
		{
			System.out.println("name.charAt("+ i +") : " + name.charAt(i));
		}
	}
}
