package practicecode;
class person
{
	int age=20;
	String name="rajan";
	void talk()
	{
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		
	}
}
public class classdemo {

	public static void main(String[] args) 
	{
		person p=new person();
		person p1=new person();
		System.out.println("Hash code: "+p.hashCode());
		//(hashcode tells where is the object located in the memory)
		p.name="prachi";
		p.age=19;
		p.talk();
		p1.talk();
	}

}
