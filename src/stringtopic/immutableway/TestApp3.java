package stringtopic.immutableway;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name= sc.next();
				
		boolean flag = true;
		
		for (int i = 0 , j = (name.length()-1); i < name.length(); i++ , j--) 
		{
			if(name.charAt(i) != name.charAt(j)) 
			{
				System.out.println(name.charAt(i)+"----"+ name.charAt(j));
				flag= false;
				break;
			}
		}
		if (flag)
		{
			System.out.println(name+ " is Palindrome");
		} else 
		{
			System.out.println(name+ " is not Palindrome");
		}
	}
}