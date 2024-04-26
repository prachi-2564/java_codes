package practicecode;

import java.io.*;
public class comparison_operator {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers to be coampared");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		boolean c=a==b;
		boolean d=a!=b;
		boolean e=a<b;
		boolean f=a>b;
		boolean g=a<=b;
		boolean h=a>=b;
		System.out.println("a==b:"+c);
		System.out.println("a!=b:"+d);
		System.out.println("a<b:"+e);
		System.out.println("a>b:"+f);
		System.out.println("a<=b:"+g);
		System.out.println("a>=b:"+h);
		
		
		
	}

}
