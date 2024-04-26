package practicecode;
import java.io.*;
public class assignmnet_operator 
{
	public static void main(String[] args)throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("enter a number:");
	 float a=Float.parseFloat(br.readLine());
	 float b=Float.parseFloat(br.readLine());
	 a+=b;
	 System.out.println("1:"+a);
	 a-=b;
	 System.out.println("2:"+a);
	 a*=b;
	 System.out.println("3:"+a);
	 a/=b;
	 System.out.println("4:"+a);
	 a%=b;
	 System.out.println("2:"+a);
	 		 
	}

}
