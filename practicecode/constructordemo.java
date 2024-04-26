package practicecode;
class Persons
{
	private int age;
	private String name;
	Persons()
	{
		name="prachi";
		age=19;
	}
	Persons(String s,int a)
	{
		name=s;
		age=a;
	}
	void talk()
	{
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
}
public class constructordemo 
{
	public static void main(String[] args) 
	{
	Persons p=new Persons();
	Persons p1=new Persons("rajan",20);
	p.talk();
	p1.talk();
	}
}
