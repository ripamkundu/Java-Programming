import java.util.Scanner;
public class number
{
	public static void main(String [] args) 
    {
        Scanner sc = new Scanner(System.in);
        int i,n;
	    System.out.println("Enter Frist Number : ");
        n = sc.nextInt()
        System.out.println("Multiple of 10: ");
		for(i=1; i<=n; i++)
        {
			if(n%10==0)
            {
				System.out.print(Mumber +" ");
			}
            else
            {
                System.out.print("Not a multiple of 3");
            }
		}

	}

}