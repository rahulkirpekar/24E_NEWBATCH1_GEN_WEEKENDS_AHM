package iotopic.byteorientedway;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Student s1= new Student(1, "Rahul",12);
		// data ===> s1
		
		// Auto Closable Resource--Java-7
		try (
				FileOutputStream fout = new FileOutputStream("records.txt");
				ObjectOutputStream out = new ObjectOutputStream(fout);
			) 
		{
			out.writeObject(s1);
			
			System.out.println("success");
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
