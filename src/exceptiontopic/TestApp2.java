package exceptiontopic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// Exception Handling---exception--raise---recover--exception
		//--------------------
		//	try..catch block
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
		int ans;
		try
		{
			// raise exception---code
			ans = no1 / no2;// raise exception---ArithmeticException
			
			String name= "";
			System.out.println(name.length());
			
			String value  = "b1a23";// String value--int====>int
			int no	= Integer.parseInt(value);//NumberFormatException
			System.out.println(no+1000);// 1123
			
		}
		catch(ArithmeticException | NullPointerException | NumberFormatException e) 
		{
			e.printStackTrace();
			ans = 0;
			System.out.println(e + " Catch Block Hanlded.");
		}
		catch(Exception e) 
		{
			e.printStackTrace();
			ans = 0;
			System.out.println("Exception---Catch Block Hanlded.");
		}
		
		System.out.println("Addition : " + ans);
	}
}




