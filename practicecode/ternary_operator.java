package practicecode;
    import java.io.*;
     public class ternary_operator 
      {
	    public static void main(String[] args) throws IOException
	    {   
	    	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			 System.out.println("enter two numbers:");
			 int a=Integer.parseInt(br.readLine());
			 int b=Integer.parseInt(br.readLine());
			 int max=(a>b)?a:b;
			 System.out.println("MAXIMUM NUMBER:"+max);
			 int min=(a<b)?a:b;
			 System.out.println("MINIMUM NUMBER:"+min);
	    }
       }
