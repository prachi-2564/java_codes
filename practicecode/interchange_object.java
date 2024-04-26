package practicecode;
class employee2
{
	int id1,id2;
	employee2(int id1,int id2)
	{
		this.id1=id1;
		this.id2=id2;
	}
}
class interchange
{
	void swap(employee2 obj)
	{
	int temp;
	temp=obj.id1;
	obj.id1=obj.id2;
	obj.id2=temp;
	}
}
public class interchange_object
{
	public static void main(String[] args) 
	{
		employee2 obj= new employee2(20,30);
		interchange i=new interchange();
		System.out.println(obj.id1 +"\t" + obj.id2);
		i.swap(obj);
		System.out.println(obj.id1 +"\t" + obj.id2);
	}
}
