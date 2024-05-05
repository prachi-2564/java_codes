package practicecode;

import java.io.*;
public class try_catch_finally 
{
	public static void main(String[] args)throws IOException 
	{

     try
     {
    	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	 System.out.println("enter numerator");
    	 int a=Integer.parseInt(br.readLine());
    	 System.out.println("enter denominator");
    	 int b=Integer.parseInt(br.readLine());
    	 double result= (double)a/b;
    	 System.out.println("result:"+result);
     }
     catch (Exception e)
     {
    	 System.out.println(e);
     }
     finally
     {
    	 System.out.println("finally:I execute always");
     }
	}

}
