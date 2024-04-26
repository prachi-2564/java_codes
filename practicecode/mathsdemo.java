package practicecode;
import java.io.*;
public class mathsdemo 
{	 
	static int a;
	public mathsdemo(int a) {
		
		this.a=a;
	}
	static int squareans()
	  {
		  System.out.println("Square of " +a+ " is:"+(a*a));
	  }
	 static  int squareroot()
	  {
		  System.out.println("Squareroot of " +a+ " is:"+(Math.sqrt(a)));  
	  }
  public static void main(String args[])throws IOException
  {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	  System.out.println("enter a number");
	  int a=Integer.parseInt(br.readLine());
	  squareans(a);
	  squareroot(a);
  }
}
