package practicecode;
import java.io.*;

public class age_exception extends Exception
{
	public age_exception(String msg)
	{
		super(msg);
	}

}
public class myage_exception 
{
	static void validateAge(int age) throws age_exception
	{
		if (age<0)
		{
			throw new age_exception("Age cannot be negative");
		}
		System.out.println("valid age:" +age);
	}
	
	public static void main(String[] args)throws IOException
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter age");
			int age = Integer.parseInt(br.readLine());
			validateAge(age);
		}
		catch(age_exception e)
		{
			System.out.println("invalid age:"+e.getMessage());
		}
	}

}
