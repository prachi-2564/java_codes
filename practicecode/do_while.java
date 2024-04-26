package practicecode;
import java.io.*;

public class do_while {

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int sum=0,i=1;
		do
		{
			System.out.println("enter a number");
			int a=Integer.parseInt(br.readLine());
			if(a<0)
			continue;
			sum+=a;
			i++;
		}
		while(i<=10);
		System.out.println("SUM: "+sum);
	}

}
