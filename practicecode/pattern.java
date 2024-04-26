package practicecode;

public class pattern {

	public static void main(String[] args) 
	{
	  for(int i=0;i<=4;i++)
	  {
		  for(int j=4-i;j>=0;j--)
		  {
			  System.out.print(j+" ");
		  }
		  System.out.println();
	  }
	
	for(int i=0;i<=4;i++)
	  {
		  for(int j=4;j>=i;j--)
		  {
			  System.out.print(j+" ");
		  }
		  System.out.println();
	  }
	for(int i=0;i<=4;i++)
	  {
		  for(int j=0;j<=i;j++)
		  {
			  System.out.print(j+" ");
		  }
		  System.out.println();
	  }
	 System.out.println();
	for(int i=0;i<=4;i++)
	  {
		  for(int j=0;j<=4;j++)
		  {
			  System.out.print(j+" ");
		  }
		  System.out.println();
	  }
	
	 System.out.println();
	 for(int i=0;i<=4;i++)
	  {
		  for(int j=4;j>=i;j--)
		  {
			  if(j==4 || i==j||i==0)
			  {
			  System.out.print(j+" ");
			  }
			  else
			  {
				  System.out.print("  ");  
			  }
		  }
		  System.out.println();
	  }
	}
}
