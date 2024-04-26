package practicecode;
import java.io.*;
public class LCM 
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers:");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int max=(a>=b?a:b);
		while(true)
		{
			if(max%a==0 && max%b==0)
			{
				System.out.println("LCM :"+max);
				break;
			}
			max++;
		}
 
	}

}
