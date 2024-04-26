package practicecode;
abstract class plan
{
	protected double rate;
	public abstract void getrate();
	public void calculate(int units)
	{
		System.out.println("Bill amount for " +units+ " units");
		System.out.println(rate*units);
	}
}
class commercial extends plan
{
	public void getrate()
	{
		rate=5.00;
	}
}
class domestic extends plan
{
	public void getrate()
	{
		rate=2.60;
	}
}


public class electricity_abstract
{

	public static void main(String[] args) 
	{
		//dynamic method dispatch
		plan p;
		System.out.println("commercial connection: ");
		p=new commercial();
		p.getrate();
		p.calculate(250);
		System.out.println("domestic connection: ");
		p=new domestic();
		p.getrate();
		p.calculate(150);
		
		
	}

}
