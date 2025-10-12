package innerclasstopic.li;

public class A 
{
	private int no = 200;
	
	void show() 
	{
		// Local Innerclass
		class B
		{
			void disp() 
			{
				System.out.println("No : " + no);
			}
		}
		B obj = new  B();
		obj.disp();
	}

	public static void main(String[] args) 
	{
		A obj  = new A();
		obj.show();
	}
}
