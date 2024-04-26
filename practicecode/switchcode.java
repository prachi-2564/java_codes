package practicecode;
import java.io.*;

public class switchcode
{

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER ID:");
		 int id=Integer.parseInt(br.readLine());
		 if(id>=101 && id<=150)
		 {
		System.out.println("Enter :\n1 for fictional books \n 2 for suspense-mystery books \n 3 for comics \n 4 for rom-com books");
		int a=Integer.parseInt(br.readLine());
		switch(a)
		{
		case 1:
			System.out.println("books available:");
			System.out.println("1.The Magic Tree”\n"
			         +"2.“Winter Fairy”\n"
					+ "3.“Wizards of Ice\n"
					 +"4.“Call of the Forest”\n"
					 +"5.“The Enchanted Ones”");
			break;
		case 2:
			System.out.println("books available:");
			System.out.println("1.And Then There Were None\n 2Before I Go To Sleep \n 3.The Girl on the Train\n");
			break;
			
		case 3:
			System.out.println("books available:");
			System.out.println("1.ninjak\n 2.Alack Sinner\n 3.Calvin and Hobbes\n 4.Asterix:\n");
			break;
		case 4:
			System.out.println("books available:");
			System.out.println("1.The Unhoneymooners\n 2.The Hating Game \n 3.Dating-ish\n 4.The Rosie Project\n");
			break;
		}
		 }
		else
		{
			System.out.println("INVALID ID CANNOT ACCESS LIBRARY ");
		}

	}

}
