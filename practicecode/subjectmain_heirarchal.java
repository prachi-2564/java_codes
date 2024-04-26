package practicecode;
class student1
{
	private String name;
	private int rno;
	void setname(String name,int rno)
	{
		this.name=name;
		this.rno=rno;
	}
	void display()
	{
		System.out.println("name:"+name);
		System.out.println("roll no:"+rno);
		
	}
}
class science extends student1
{
	private int chem,bio,phy;
	void setmarks(int a,int b,int c)
	{
		super.setname("Student 1", 1);
		chem=a;
		bio=b;
		phy=c;
	}
	void display()
	{
		super.display();
		System.out.println("Chemistry:"+chem);
		System.out.println("Biology:"+bio);
		System.out.println("Physics:"+phy + "\n");
	}
}
class commerce extends student1
{
	private int acc,bom,st;
	void setmarks(int a,int b,int c)
	{
		super.setname("Student 2", 2);
		acc=a;
		bom=b;
		st=c;
	}
	void display()
	{
		super.display();
		System.out.println("Account:"+acc);
		System.out.println("BOM:"+bom);
		System.out.println("ST:"+st+ "\n");
	}
	
}

public class subjectmain_heirarchal {

	public static void main(String[] args) 
	{
		student1 s=new student1();
		science sci=new science();
		commerce c=new commerce();
		sci.setmarks(100, 90, 80);
		sci.display();
		c.setmarks(67, 70, 83);
		c.display();
	

	}

}
