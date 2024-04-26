package practicecode;
import java.util.*;
public class demo {

	public static void main(String[] args)
	{
     Scanner sc=new Scanner(System.in);
     System.out.println("ENTER A NUMBER");
     int a=sc.nextInt();
     System.out.println("ENTER A FLOAT NUMBER");
     float b=sc.nextFloat();
     System.out.println("ENTER A DOUBLE NUMBER");
     double c=sc.nextFloat();
     System.out.println("ENTER A STRING");
     String d=sc.next();
     System.out.println("ENTER A CHARACTER");
     char e=sc.next().charAt(0);
     System.out.println("a:"+a+"\nb:"+b+"\nc:"+c+"\nd:"+d+"\ne:"+e);
	}

}
