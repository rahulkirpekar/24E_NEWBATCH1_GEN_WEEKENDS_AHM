package iotopic.byteorientedway;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		try 
			(
					FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\24E_NEWBATCH1_GEN_WEEKENDS_AHM\\records.txt");
					ObjectInputStream oin  = new ObjectInputStream(fin);
			)
		{
		
			Student s  = (Student)oin.readObject();
		
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd());
			
		} catch (ClassNotFoundException | IOException e) 
		{
			e.printStackTrace();
		}  
	}
}
