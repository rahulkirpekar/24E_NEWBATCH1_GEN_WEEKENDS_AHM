package exceptiontopic;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		int ans = 0;
				
		try 
		{
			ans = 10 / 0;
			
		} catch (NullPointerException e) 
		{
			e.printStackTrace();
		}finally 
		{
			System.out.println("Hi I am Finally Block");
		}
	}
}
