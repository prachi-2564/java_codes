package practicecode;
import java.io.*;

public class array 
{
	public static void main(String[] args)throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of subjects:");
		int a=Integer.parseInt(br.readLine());
		int marks[]=new int[a];
		for(int i=0;i<a;i++)
		{
			System.out.println("Enter marks: ");
			marks[i]=Integer.parseInt(br.readLine());
		}
		int total=0;
		for(int i=0;i<a;i++)
		{
			total+=marks[i];
		}
		System.out.println("Total marks:  "+total);
		float per=(float)(total*100)/(a*100);
		System.out.println("Percentage: "+per);
	}

}
