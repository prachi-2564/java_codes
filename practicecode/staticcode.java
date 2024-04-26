package practicecode;
class sample
{
	static double sum(double n1,double n2)
	{
		double res=n1+n2;
		return res;
	}
}
class test
{
	 static int x=55;
	 static void display()
	{
		 System.out.println(x);
	}
}
public class staticcode 
{
	public static void main(String[] args)
	{
//     double x= sample.sum(10,20.7);
//     System.out.println("SUM: "+x);
		test obj1=new test();
		test obj2=new test();
		++obj1.x;
		System.out.println("x in obj1: ");
		obj1.display();
		System.out.println("x in obj2: ");
		obj2.display();
	
	}
}
