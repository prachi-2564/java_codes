package practicecode;
import java.io.*;
public class armstrong {

	public static void main(String[] args)throws IOException
	{
        int r=0,ans=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number");
		int a=Integer.parseInt(br.readLine());
		int count=0;
        int org=a;
        while(a!=0)
        {
        	a/=10;
        	count++;
        }
        a=org;
        while(a!=0)
        {
        	r=a%10;
        	ans+=Math.pow(r,count);
        	a/=10;
        }
        if(ans==org)
        {
        	System.out.println(org+" is an armstrong number");
        }
        else
        {
        	System.out.println(org+" is not an armstrong number");
        }
        
	}
}
