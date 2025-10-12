package innerclasstopic.ai;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		A objA = new A()
		{
			@Override
			public int addFun(int no1, int no2) 
			{
				return (no1+no2);
			}
		};
		
		int ans = objA.addFun(20, 10);
		
		System.out.println("Addition : " + ans);
		
	}
}
