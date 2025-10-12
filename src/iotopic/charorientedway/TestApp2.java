package iotopic.charorientedway;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileReader fr = new FileReader("C:\\Users\\Royal\\eclipse-workspace\\24E_NEWBATCH1_GEN_WEEKENDS_AHM\\data.txt");
			
			int temp;
			
			while(	(temp = fr.read()) != -1	) 
			{
				char c = (char)temp;
				System.out.print(c);
			}

			fr.close();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
