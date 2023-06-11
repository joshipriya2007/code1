package Array10;

import java.util.Arrays;

public class eg1_int 
{
public static void main(String[] args) 
{
	{
		int[]ar=new
			int[3];
	
		ar[0]=256;
		ar[1]=134;
		ar[2]=200;
	
		System.out.println(ar.length);
		System.out.println("---------------------------------------");
	
		System.out.println("\n");
	
			for(int i=0;i<=ar.length-1;i++)
		{
	
			System.out.print(ar[i]+" ");
	
		}
			
			System.out.println("Int Array normal order");
			System.out.println("\n");
			for(int i=ar.length-1; i>=0; i--)
			{
				
				System.out.print(ar[i]+" ");
				
			}
			System.out.println("Int Array reverse order");
			
		Arrays.sort(ar);
		
		
		
		System.out.println("\n");
		System.out.println("---------------------------------------");
		System.out.println("Int Array sorting in asc and desc order");
		System.out.println("\n");
		
		for(int i=0;i<=ar.length-1;i++)
		{
				System.out.print(ar[i]+" ");
		}
		
		System.out.println("\n");
		
		
		
		for(int i=ar.length-1; i>=0; i--)
		{
			
			System.out.print(ar[i]+" ");
			
		}
		System.out.println("\n");
		
		System.out.println("---------------------------------------");
	}


	{
		String[] s=new
				String[5];
		
		s[0]="Sanu";
		s[1]="Mau";	
		s[2]="Krupa";
		s[3]="Mihu";
		s[4]="Adi";
		
		System.out.println("\n");
		
		
		System.out.println("String Array normal and reverse order");
		System.out.println("\n");
		
		
		for(int i=0;i<=s.length-1;i++)
		{
			System.out.print(s[i]+" ");
						
		}
		
		System.out.println("\n");
		
		for(int i=s.length-1; i>=0; i--)
		{
			
			System.out.print(s[i]+" ");
			
		}
		
		
		System.out.println("\n");
		System.out.println("---------------------------------------");
		Arrays.sort(s);
		
		System.out.println("String Array sorting in asc order");
		System.out.println("\n");
		
		for(int i=0;i<=s.length-1;i++)
		{
			System.out.print(s[i]+" ");
			
		}
		System.out.println("\n");
		System.out.println("---------------------------------------");
		System.out.println("\n");
		System.out.println("String Array sorting in desc order");
		
		System.out.println("\n");
		for(int i=s.length-1; i>=0; i--)
		{
			
			System.out.print(s[i]+" ");
			
		}
		System.out.println("\n");
		System.out.println("---------------------------------------");
		
	}

	{

			char[] c= new
					char[4];
			
			c[0]='Z';
			c[1]='T';
			c[2]='X';
			c[3]='P';
			
			System.out.println("\n");
			System.out.println("Char Array normal order and reverse orde");
			System.out.println("\n");
			
			for(int i=0; i<=c.length-1;i++)
			{
				
				System.out.print(c[i]+" ");
				
			}
			System.out.println("\n");
			
			
			for(int i=c.length-1; i>=0; i--)
			{
				
				System.out.print(c[i]+" ");
				
			}
			
			Arrays.sort(c);
			
			System.out.println("\n");
			System.out.println("---------------------------------------");
			System.out.println("Char Array sorting in asc and desc order");
			System.out.println("\n");
			
			for(int i=0; i<=c.length-1;i++)
			{
				
				System.out.print(c[i]+" ");
				
			}
			System.out.println("\n");
			for(int i=c.length-1; i>=0; i--)
			{
				
				System.out.print(c[i]+" ");
				
			}
			
	}




}}
