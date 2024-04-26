package practicecode;

import java.io.*;


public class factors {

	public static void main(String[] args)throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number");
		int a=Integer.parseInt(br.readLine());
		System.out.println("factors of "+a+ " are:" );
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				System.out.println(i);
			}
		}
	}

}
