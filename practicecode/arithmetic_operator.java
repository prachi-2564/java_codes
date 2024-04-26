package practicecode;
import java.io.*;
public class arithmetic_operator
{

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER TWO NUMBERS:");
		float a=Float.parseFloat(br.readLine());
		float b=Float.parseFloat(br.readLine());
		System.out.println("ADDITION:"+ (a+b));
		System.out.println("\n SUBSTRACTION:"+ (a-b));
		System.out.println("\n MULTIPLICATION:"+ (a*b));
		System.out.println("\n QUOTIENT:"+ (a/b));
		System.out.println("\n REMAINDER:"+ (a%b));

	}
}
