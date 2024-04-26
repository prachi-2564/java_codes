package practicecode;
import java.io.*;
public class bitwise_operator 
{
	public static void main(String[] args) throws IOException 
	{
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter two numbers:");
		 int a=Integer.parseInt(br.readLine());
		 int b=Integer.parseInt(br.readLine());
		 System.out.println("a&b: " +(a&b));
		 System.out.println("a|b: " +(a|b));
		 System.out.println("a^b: " +(a^b));
		 System.out.println("a<<1: " +(a<<1));
		 System.out.println("~b: " +(~b));
		 System.out.println("b>>1: " +(b>>1));
		 
	}

}
