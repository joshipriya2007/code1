package Array1;
import java.util.Arrays;


public class eg1_int 
{
	public static void main(String[] args) 
	{
		{int[] ar= new
				int[5];
		
		ar[0]=12;
		ar[1]=13;
		ar[2]=128;
		ar[3]=14;
		ar[4]=111;
		
	
		System.out.println(ar.length);
		
	
		System.out.println(ar[0]);
		
		System.out.println("\n");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			
			System.out.println(ar[i]);
			
		}
		
		System.out.println("\n");
		
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
		
		Arrays.sort(ar);
		
		System.out.println("\n");
		for(int i=0; i<=ar.length-1; i++)
		{
			
			System.out.println(ar[i]);
			
		}
		
		System.out.println("\n");
		
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
		
		}
		
		
		System.out.println("\n");
		String[] s=new
				String[3];
		
		s[0]="Adwait";
		s[1]="Saket";
		s[2]="Aditya";
		
		System.out.println(s.length);
	
		System.out.println(s[0]);
		
		System.out.println("\n");
		
		
		for(int i=0;i<=s.length-1;i++)
		{
			System.out.println(s[i]);
		}
		
		System.out.println("\n");
		
		for (int i=s.length-1;i>=0;i--)
		{
			System.out.println(s[i]);
		}
		
		Arrays.sort(s);
		System.out.println("\n");
		
		
		for(int i=0;i<=s.length-1;i++)
		{
			System.out.println(s[i]);
		}
		
		System.out.println("\n");
		
		for (int i=s.length-1;i>=0;i--)
		{
			System.out.println(s[i]);
		}
		
		System.out.println("\n");
		char[] c=new
				char[8];
		
		
		c[0]='A';
		c[1]='B';
		
		c[2]='E';
		c[3]='F';
		
		c[4]='C';
		c[5]='D';
		
		c[6]='G';
		c[7]='H';
		
		
		System.out.println(c.length);
		System.out.println(c[5]);
		
		System.out.println("\n");
		
		for(int i=0; i<=c.length-1;i++)
		{
			System.out.println(c[i]);
		}
		

		System.out.println("\n");
		
		
		for(int i=c.length-1;i>=0; i--)
		{
			System.out.println(c[i]);
			}
		
		Arrays.sort(c);
		
		System.out.println("\n");
		for(int i=0; i<=c.length-1;i++)
		{
			System.out.println(c[i]);
		}
		

		System.out.println("\n");
		
		for(int i=c.length-1;i>=0; i--)
		{
			System.out.println(c[i]);
			}
		
		
	}

}
