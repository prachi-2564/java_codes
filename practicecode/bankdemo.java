package practicecode;
import java.io.*;
class bank
{
	String name;
	int accno,pin;
	double amount;
	void register()throws IOException
	   {
		System.out.println("REGISTRATION PAGE");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your name:");
	    name=br.readLine();
		System.out.println("enter your account number:");
		accno=Integer.parseInt(br.readLine());
		System.out.println("enter your account pin:");
		pin=Integer.parseInt(br.readLine());
		System.out.println("enter your bank balance:");
	    amount=Double.parseDouble(br.readLine());
	    
	}
	void login()throws IOException
	{
		System.out.println("LOGIN PAGE:");
		int acc,p,s;
		double amo=0;
		String n; 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your name:");
	    n=br.readLine();
		System.out.println("enter your account number:");
		acc=Integer.parseInt(br.readLine());
		System.out.println("enter your account pin:");
		p=Integer.parseInt(br.readLine());
		
	    if(acc==accno && p==pin)
	    {
	    	System.out.println("Choose :1 for deposit \n 2 for withdraw \n 3 for displaying details");
	    	s=Integer.parseInt(br.readLine());
	    	switch(s)
	    	{
	    	case 1:
	    		System.out.println("enter the amount you want to deposit");
	    		int x=Integer.parseInt(br.readLine());
	    		amo+=x;
	    		System.out.println("current balance:"+amo);
	    		break;
	    	case 2:
	    		System.out.println("enter the amount you want to withdraw");
	    		int y=Integer.parseInt(br.readLine());
	    		if( y<amo)
	    		{
	    			amo-=y;
	    		System.out.println("current balance:"+amo);
	    		}
	    		else
	    		{
	    			System.out.println("Insufficient balance");
	    		}
	    		break;
	    	case 3:
	    		System.out.println("Name :"+n);
	    		System.out.println("account number:"+acc);
	    		System.out.println("Current balance:"+amo);
	    		break;
	    	}
	    }
	    else
	    {
	    	System.out.println("User not found");
	    }
		
	}	
}
public class bankdemo 
{
	public static void main(String[] args)throws IOException
	{
		bank b=new bank();
		b.register();
		b.login();
	}
}
