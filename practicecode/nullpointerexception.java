package practicecode;

public class nullpointerexception
{

	public static void main(String[] args) 
	{
		try
		{
			String str=null;
			 System.out.println("length of string:"+str.length());
		}
		catch(NullPointerException e)
		{
			 System.out.println("NullPointerException caught:"+e.getMessage());
		}
		

	}

}
