package practicecode;

public class diamond 
{

	public static void main(String[] args)
	{
		int i, j, k;
        for (i = 0; i <= 4; i++) 
        {
            for (j = 0; j <= 5 - i; j++) 
            {
                System.out.print(" ");
            }
            for (k = 0; k != 2 * i + 1; k++) 
            {
                if (k == 0 || k == 2 * i)
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        for (i = 5; i >= 0; i--) {
            for (j = 0; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k != 2 * i + 1; k++) {
                if (k == 0 || k == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }


	}
            System.out.println();

}
}
}
