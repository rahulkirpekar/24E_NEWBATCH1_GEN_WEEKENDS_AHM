package arraytopic;
import java.util.Scanner;
/*
  1'd Array Declaration:-
-----------------------
		int a[] = new int[5];
----------------------------------------------
		int []a = new int[5];
----------------------------------------------
		int[] a = new int[5];
----------------------------------------------
		int [] a = new int[5];
----------------------------------------------
		int a[] = null;
		a = new int[5];
-------------------------------------------
  1'd Array Declaration with Initialisation:-
--------------------------------------------
			int a[] = new int[]{1,2,3,4,5};
		-------------------------------------------
			int a[] = {1,2,3,4,5}; 
 */
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[5];
		
//		float b[] = new float[5];
//		char c[] = new char[5];
		
		System.out.println("a.length : " + a.length);

		int sum = 0 ;
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter A["+ i +"] : ");
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		
		int max = 0;
		for (int i = 0; i < a.length; i++) 
		{
			if (max < a[i]) 
			{
				max = a[i];
			}
			System.out.println("A["+i+"] : " + a[i]);
		}
		System.out.println("Maximum Value : " + max);
	}
}



