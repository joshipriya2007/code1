package Programs;

public class eg5_pallindrome 
{
		public static void main(String[] args) 
		{
			
			String org="abcd";
			
			String rev="";
			
			for(int i=org.length()-1;i>=0;i--)
				
			{
				
				rev= rev+org.charAt(i);
				
							
			}
			
			
			System.out.println("Original String:"+org);
			
			System.out.println("\n");
			
			System.out.println("REV String:"+rev);
			
			
			if(org.equals(rev))
			{
				System.out.println("given string is pallindrome");
				
			}
			
			else
				
			{
				
				System.out.println("given string is not pallindrome");
				
			}
			
		}
	
	
	
}
