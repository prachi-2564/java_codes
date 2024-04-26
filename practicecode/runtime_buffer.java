package practicecode;
import java.io.*;
public class runtime_buffer 
{
	public static void main(String[] args )throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER A NUMBER");
		int a=Integer.parseInt(br.readLine());
		System.out.println("ENTER A FLOAT NUMBER");
	    float b=Float.parseFloat(br.readLine());
	    System.out.println("ENTER A DOUBLE NUMBER");
	    double c=Double.parseDouble(br.readLine());
	    System.out.println("ENTER A STRING");
	    String d=br.readLine();
	    System.out.println("ENTER A CHARACTER");
	    char e=(char)br.read();
	    System.out.println("a:"+a+"\nb:"+b+"\nc:"+c+"\nd:"+d+"\ne:"+e);

	}

}
