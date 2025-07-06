package basic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No : ");
		int no = sc.nextInt();
		int fc=0;
		for (int i = 1; i <=no; i++) 
		{
			if (no%i==0) 
			{
				fc++;
			}
		}
		if (fc==2) 
		{
			System.out.println("No is Prime : " + no);
			
		} else 
		{
			System.out.println("No is not Prime : " + no);
		}
	}
}
