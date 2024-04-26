package practicecode;
import java.io.*;

public class gcd 
{

	public static void main(String[] args)throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers:");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int ans=0;
		for(int i=1;i<=a&&i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				ans=i;
			}
		}
		System.out.println("GCD of " +a+ " and "+b+" is: "+ans);
	}

}
