package Array11;
import java.util.Arrays;
public class eg5_array_sorting
{
	public static void main(String[] args) 
	{
		
	
	
		
		int[]ar= new
				int [5];		// array intilization
		
		ar[0] =25;				//array declaration
		ar[1] =20;
		ar[2] =65;
		ar[3] =35;
		ar[4] =55;
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);				//array usage
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);
		System.out.println(ar.length);
		
		System.out.println("Print original data");
		
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
