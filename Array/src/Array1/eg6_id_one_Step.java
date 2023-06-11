package Array1;

import java.util.Arrays;

public class eg6_id_one_Step 
{
public static void main(String[] args) 
{
	{
		int[] ar = {40,20,30,10};
	
	
	System.out.println(ar.length);
	
	System.out.println("\n");
	
	for(int i=0; i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	System.out.println();
	
	Arrays.sort(ar);
	
	for(int i=0; i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	
	}
	
	{
	
	String[] s= {"Priya", "Adi", "Saket"};
	System.out.println("\n");
	System.out.println(s.length);
	
	for(int i=0; i<=s.length-1;i++)
	{
		System.out.println(s[i]);
	}
	Arrays.sort(s);
	System.out.println("\n");
	for(int i=0; i<=s.length-1;i++)
	{
		System.out.println(s[i]);
	}
	}
	
}
	
}
