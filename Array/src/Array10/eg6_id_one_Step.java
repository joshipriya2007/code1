package Array10;

import java.util.Arrays;

public class eg6_id_one_Step 
{
	public static void main(String[] args) 
	
	{
		{int[] ar = {3,1,2};
		
		System.out.println(ar.length+"     Array length  in int datatype   ");
		
		System.out.println("-------------------------");
		
		System.out.println("    array in normal order     ");
		
		for(int i=0;i<=ar.length-1;i++)
		{
		System.out.println(ar[i]);
		
		}
		
		System.out.println("-------------------------");
		
		
			Arrays.sort(ar);
			
			System.out.println("    array Sorting in int datatype in asce order   ");
			
			
			for(int i=0;i<=ar.length-1;i++)
			{
			System.out.println(ar[i]);
			
			}
			
			System.out.println("-------------------------");
			
		
		
		}
		
		{String[] s= {"Priya","Varsha","Ashu"};
		
		System.out.println(s.length);
		
		System.out.println("-------------------------");
		
		for(int i=0;i<=s.length-1;i++)
		{
		System.out.println(s[i]);
		
		}
		System.out.println("-------------------------");
		
		
		}
		
		
		
		
		
		
		
	}	

}
