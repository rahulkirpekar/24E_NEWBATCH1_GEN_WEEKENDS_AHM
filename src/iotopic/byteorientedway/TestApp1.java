package iotopic.byteorientedway;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// ByteOriented way to Data---write---file
// write---FileOutputStream class
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		
//		String data convert into Byte
		byte b[] = name.getBytes();
		
		// Data ---String---write by Byteoriented way
		try 
		{
			FileOutputStream fout = new FileOutputStream("list.txt");

			fout.write(b);
		
			fout.close();
			
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


