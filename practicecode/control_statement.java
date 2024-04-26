package practicecode;
import java.io.*;
public class control_statement 
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER YOUR NATIONALITY");
		String str=br.readLine();
		if(str.equals("indian"))
		{
			System.out.println("ENTER YOUR AGE:");
			int a=Integer.parseInt(br.readLine());
			if(a>=18)
			{
				System.out.println("You are eligible for voting");	
			}
			else
			{
				System.out.println("Your age is not eligible for voting");
			}
		}
		else
		{
			System.out.println("You are not eligible for voting");
		}
	}
}
