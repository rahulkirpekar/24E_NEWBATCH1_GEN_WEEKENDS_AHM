package oops.classobject;

import java.util.Scanner;
// class:-
//[Pure Encapsulation]---[Data Security]
		// Dm's----private
		// Mf's----public
public class Student 
{
	// 1. Data Members--store Data into Dm's
	private int rno,std,marks;
	private String name;
	
	// 2. Member Function--Data operation---methods
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(rno +" " + name+" " + std);
	}	
}
