package practicecode;
class personcode
{
	private String name;
	private int age;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	
}
public class personthis
{
	public static void main(String[] args)
	{
		personcode p1=new personcode();
		p1.setName("PRACHI");
		p1.setAge(19);
		System.out.println("Name:"+p1.getName());
		System.out.println("Age:"+p1.getAge());
		
	}
	
}
