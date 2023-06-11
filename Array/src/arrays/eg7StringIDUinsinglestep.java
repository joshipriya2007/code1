package arrays;

public class eg7StringIDUinsinglestep 
{
	
	public static void main(String[] args) 
	{
		
	
		String[] ar = {"Priya", "Saket", "Adi", "Onkar"};
		
		System.out.println(ar.length);
		
		System.out.println(ar[2]);
		
		System.out.println("==============================================");
		for(int i=0; i<=ar.length-1;i++)
			
		{
			System.out.println(ar[i]);
		}
		System.out.println("==============================================");

		for(int i=ar.length-1; i>=0;i--)
		{
			System.out.println(ar[i]);
		}
}
	
}
