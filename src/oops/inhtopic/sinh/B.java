package oops.inhtopic.sinh;

// child / sub / derived
public class B extends A
{
	int no2;
	
	public static void main(String[] args) 
	{
		B obj = new B();
		
		obj.no1=10;
		obj.no2=10;
		
		System.out.println("obj.no1 : " + obj.no1);
		System.out.println("obj.no2 : " + obj.no2);
	}
}
