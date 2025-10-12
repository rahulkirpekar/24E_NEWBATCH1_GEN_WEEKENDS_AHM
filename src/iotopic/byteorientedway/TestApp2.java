package iotopic.byteorientedway;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\24E_NEWBATCH1_GEN_WEEKENDS_AHM\\list.txt");
		
			int temp ;
			
			while( (temp = fin.read())   != -1) 
			{
				sb.append((char)temp);
			}
		
			fin.close();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.print("Final String : " + sb); 
	}
}
