package practicecode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
class teacher
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String name;
	int id;
	float salary;
	void getid()throws IOException
	{
		System.out.println("Enter id:");
		id=Integer.parseInt(br.readLine());
	}
	void getname()throws IOException
	{
		System.out.println("Enter name:");
		name=br.readLine();
	}
	
	void getsalary()throws IOException
	{
		System.out.println("Enter salary:");
		 salary=Integer.parseInt(br.readLine());
		 
	}
	void tdisplay()
	{
		System.out.println("teacher id: " +id +"\nteacher name: " +name+ "\nteacher salary:" +salary);
		
	}
}
class student extends teacher
{
	float marks;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	void getmarks()throws IOException
	{
		System.out.println("Enter marks:");
		marks=Integer.parseInt(br.readLine());	
	}
	void sdisplay()
	{
		System.out.println("student  id: " +id +"\nstudent name: " +name+ "\nstudent marks:" +marks);
	}
	
}
public class single_inheritance
{

	public static void main(String[] args)throws IOException 
	{
		System.out.println("Enter teacher details:");
		student s1=new student();
		s1.getid();
		s1.getsalary();
		s1.getname();
		s1.tdisplay();
		System.out.println("Enter student details:");
		 student s=new student();
		s.getid();
		s.getmarks();
		s.getname();
		s.sdisplay();
		
	}

}
