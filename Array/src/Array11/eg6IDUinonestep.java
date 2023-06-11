package Array11;

import java.util.Arrays;

public class eg6IDUinonestep 
{
	public static void main(String[] args)
	
	{
		
		int [] ar = {10, 30, 55, 20, 25};
		
		
		System.out.println(ar.length);
		
		
		System.out.println(ar[3]);
		
		
		System.out.println("\n");
		
		
		for(int i=0; i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
			
		
		}
		
		Arrays.sort(ar);
		

		System.out.println("\n");
		
		for(int i=0; i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("\n");
		for(int i=ar.length-1; i>=0;i--)
		{
			System.out.println(ar[i]);
		}
		
		
		
	}

}
