package practicecode;
import java.io.*;
class employee
{
	
	String name;
	int id,salary;
	employee()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name:");
		name=br.readLine();
		System.out.println("Enter id:");
	    id=Integer.parseInt(br.readLine());
		System.out.println("Enter salary:");
		salary=Integer.parseInt(br.readLine());
	}
	void display()
	{
		System.out.println("name:"+name);
		System.out.println("id:"+id);
		System.out.println("salary:"+salary);
		
	}
	
}
public class highestsalary {

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		employee e=new employee();
		employee e1=new employee();
		
		if(e.salary>e1.salary)
		{
			System.out.println(e.name+ " has greater salary");
		}
		else
		{
			System.out.println(e1.name+ " has greater salary");
		}
		

	}

}
