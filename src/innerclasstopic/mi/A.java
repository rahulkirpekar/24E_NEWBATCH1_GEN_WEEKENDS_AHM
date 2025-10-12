package innerclasstopic.mi;

// Outer class
public class A 
{
	private int no = 100;
	
	// 1. Member Innerclass
	class B
	{
		void disp() 
		{
			System.out.println("NO : " + no);
		}
	}
	public static void main(String[] args) 
	{
		A objA = new A();
		 
		A.B objB = objA.new B();
		
		objB.disp();
	}
}
