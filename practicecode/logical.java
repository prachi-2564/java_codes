package practicecode;
import java.io.*;
public class logical {

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter four number:");
		 int a=Integer.parseInt(br.readLine());
		 int b=Integer.parseInt(br.readLine());
		 int c=Integer.parseInt(br.readLine());
		 int d=Integer.parseInt(br.readLine());
		 boolean p=((a==b)&&(c!=d));
		 boolean q=((a<=b)&&(c==d));
		 boolean r=((a==d)&&(c==d));
		 boolean s=((a>=b)&&(c<=d));
		 System.out.println("((a==b)&&(c!=d)):"+p);
		 System.out.println("((a<=b)&&(c==d)):"+q);
		 System.out.println("(a==d)&&(c==d):"+r);
		 System.out.println("(a>=b)&&(c<=d):"+s);
		 boolean t=((a!=b)||(c!=d));
		 boolean u=((a<=b)||(c==d));
		 boolean v=((a<c)||(c==d));
		 boolean w=((a>=b)||(c<=d));
		 System.out.println("((a==b)||(c!=d)):"+t);
		 System.out.println("((a<=b)||(c==d)):"+u);
		 System.out.println("(a==d)||(c==d):"+v);
		 System.out.println("(a>=b)||(c<=d):"+w);
		 boolean m =!(a<5);
		 boolean n =!(c>15);
		 boolean o =!(b<=8);
		 boolean i =!(d!=7);
		 System.out.println("!(a<5):"+m);
		 System.out.println("!(c>15):"+n);
		 System.out.println("!(b<=8):"+o);
		 System.out.println("!(d!=7):"+i);
		
	}

}
