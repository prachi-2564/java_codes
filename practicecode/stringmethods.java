package practicecode;

public class stringmethods {

	public static void main(String[] args) 
	{
        String s1 = "A book on Java ";
        String s2 = new String("I like it...");
        char arr[] = {'D','r','e','a','m','t','e','c','h',' ','p','r','e','s','s'};
        String s3 = new String (arr);
        System.out.println("String 1"+s1);
        System.out.println("String 2"+s2);
        System.out.println("String 3"+s3);
        System.out.println("Length of s1= "+s1.length());
        System.out.println("Length of s2= "+s2.length());
        System.out.println("Length of s3= "+s3.length());
        System.out.println("s1 and s2 joined = "+s1.concat(s2) );
        System.out.println(s1+"from "+s3);
       boolean x= s1.startsWith("A");
       if(x) System.out.println("S1 start with \'A\' ");
       else System.out.println("s1 does not start with \'A\'");
       String p = s2.substring(0,7);
       System.out.println("substring p = " + p);
       String q = s3.substring(0,9);
       System.out.println("substring q = " + q);
       System.out.println("joining two sub string " +(p+q));
       System.out.println("UPPER s1 : "+s1.toUpperCase());
       System.out.println("lower s1 : "+s1.toLowerCase());

	}

}
