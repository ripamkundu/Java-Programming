import java.util.Scanner;
public class salary
{
	public static void main(String [] args) 
	{
        int i, n, j;
		Scanner sc = new Scanner(System.in);
        int []arr = new int[100];
		System.out.println("How Many Employee You Wants?");
		n = sc.nextInt();
        System.out.println(n + "No of Employee salary : ");
        for(i=0; i<n; i++)
		{
            System.out.println("Employee salary : ");
			arr[i] = sc.nextInt();   
		}
        j = arr[0];
        for(i=0; i<n; i++)
        {
            if (j < arr[i])
            {
                j = arr[i];
            }
        }
        System.out.println("Highest Salary Of an employee:  "+j); 
    }
}
