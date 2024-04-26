package practicecode;

import java.io.BufferedReader;
import java.io.*;

public class student_multilevel extends grade
{

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int math,ss,sci,eng,hindi;
		System.out.println("enter 5 subject marks: ");
		 math=Integer.parseInt(br.readLine());
		 ss=Integer.parseInt(br.readLine());
	     sci=Integer.parseInt(br.readLine());
	     eng=Integer.parseInt(br.readLine());
		 hindi=Integer.parseInt(br.readLine());
		 grade g=new grade(math, ss,sci, eng, hindi);
		 g.getgrade();

	}

}
