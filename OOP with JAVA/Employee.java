import java.io.*;
public class Employee
{
	public static void main(String [] arg) throws IOException
	{
        int i, n, max;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int []a = new int[100];
		System.out.println("How Many Employee You Wants?");
		n = Integer.parseInt(br.readLine());
        System.out.println("Enter " + n + " No of Employee salary : ");
        for(i=0; i<n; i++)
		{
            System.out.println("Enter Employee salary : ");
			a[i] = Integer.parseInt(br.readLine());    
		}
        max = a[0];
        for(i=0; i<n; i++)
        {
            if (max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Highest Salary Of an employee:  "+max); 
    }
}
