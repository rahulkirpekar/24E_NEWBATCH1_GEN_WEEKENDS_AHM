package oops.abstopic.aclass.task1;

import java.util.Scanner;

public class TestApp1 
{
	public static void getResultBasedOnPlace(Person person) 
	{
		person.getBehave();
		
		// -person----student(School)
//		person.getResult();//C.E
		
		if(person instanceof School) 
		{
			// Downcasting
			School student = (School)person; 
			student.getResult();
		}
		else if(person instanceof Org) 
		{
			// Downcasting
			Org emp = (Org)person;
			emp.getSalary();
		}
		else if(person instanceof Home) 
		{
			// Downcasting
			Home child = (Home)person;
			child.getMovieOntime();
		}
		else if(person instanceof PublicPlace) 
		{
			// Downcasting
			PublicPlace citizen = (PublicPlace)person;
			citizen.getPublicEvent();
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter below choice : ");
		System.out.println("1) For School");
		System.out.println("2) For Org");
		System.out.println("3) For PublicpLace");
		System.out.println("4) For Home");
		int choice=  sc.nextInt();
		
		switch(choice) 
		{
			case 1: 
					// Polymorphic Object/Upcasting
					School school = new School();
					getResultBasedOnPlace(school);
					break;
					
			case 2: Org org = new Org();
					getResultBasedOnPlace(org);
					break;
					
			case 3: PublicPlace publicPlace = new PublicPlace();
					getResultBasedOnPlace(publicPlace);
					break;
					
			case 4: Home home = new Home();
					getResultBasedOnPlace(home);
					break;
		}
	}
}
