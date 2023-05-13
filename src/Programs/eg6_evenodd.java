package Programs;

import java.util.Scanner;

public class eg6_evenodd 
{
	public static void main(String[] args)
	{
		
		
		Scanner s = new
				   Scanner(System.in);
		   
		   System.out.println("Enter Num:");
		   int num=s.nextInt();
		
		
		
		
		if (num % 2==0)
		{
			
			System.out.println("given no. is even");
			
		}
				
		else
		{
			System.out.println("given no. is not even");
			
		}
		
		
		for (int i=1; i<=num; i++)   
		{  
		
		if (i % 2==0)   
		{  
		System.out.println(i + " ");
		
		}
		
		}
		
		
		
		
		
	}
}
