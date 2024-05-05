package practicecode;

public class myexception extends Exception
{
	private static int accno[] = { 101, 102, 203, 104, 103 };
	private static String name[] = { "Ronak", "Prachi", "Laxmi", "Riya", "Tapan" };
	private static double balance[] = { 100000, 120000, 4500, 1245.60, 99.99,1100.55 };
	myexception(String str)
	{
		super(str);
	}
	public static void main(String args[])
	{
		try
		{
			System.out.println("acc_no \t name \t balance");
			for(int i=0;i<5;i++)
			{
				System.out.println(accno[i]+ "\t" + name[i] +"\t" +balance[i]);
				if(balance[i]<1000)
				{
					myexception me=new myexception("\n balance amount is less");
					throw me;
				}
			}
		}
			catch(myexception me)
			{
				me.printStackTrace();
			}
		
	}

}
