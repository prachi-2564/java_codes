package practicecode;
import java.util.*;
public class array2d {
	public static void main(String[] args)
	{
		System.out.println("Enter number of rows and columns: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int arr[][]= new int[a][b];
		System.out.println("Enter elements of matrix: ");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Elements of matrixs:");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(arr[i][j]+ " ");
			} 
			System.out.println();
		}
		for(int j=0;j<b;j++)
		{
			for(int i=0;i<a;i++)
			{
				System.out.print(arr[j][i]+ " ");
			}
			System.out.println();
		}
		
	}
}
