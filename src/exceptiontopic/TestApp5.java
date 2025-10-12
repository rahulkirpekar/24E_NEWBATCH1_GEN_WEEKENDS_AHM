package exceptiontopic;

import java.io.IOException;
import java.util.Scanner;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age : ");
		int age  = sc.nextInt();
		
		try 
		{
			isValidForVote(age);
		} catch (InvalidAgeException e) 
		{
			e.printStackTrace();
		}
	}
	public static void isValidForVote(int age) throws InvalidAgeException
	{
		if(age < 18) 
		{
			// age --->raise exception
			throw new InvalidAgeException("\n\"Invalid Age,\n\tPlease enter valid Age.\"");
			
		}else 
		{
			System.out.println("Welcome for Vote");
		}
	}
}