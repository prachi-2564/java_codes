package practicecode;
class samplecode
{
	private int x;
	samplecode()
	{
		this(55);
		this.access();
	}
	samplecode(int x)
	{
		this.x=x;
	}
	void access()
	{
	System.out.println("x: "+x);
	}
}
public class thiskeyword 
{
	public static void main(String[] args)
	{
		samplecode s=new samplecode();
	}
}
