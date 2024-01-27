import java.io.*;
public class day
{
	public static void main(String []arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int n;
		System.out.println("Enter Any Number of Day : ");
		n = Integer.parseInt(br.readLine());
		if(n == 1)
		{
			System.out.println("Sunday");
		}
		else if (n==2)
		{
			System.out.println("Monday");
		}
		else if(n==3)
		{
			System.out.println("Tuesday");
		}
		else if(n==4)
		{
			System.out.println("Wednesday");
		}
		else if(n==5)
		{
			System.out.println("Thursday");
		}
		else if(n==6)
		{
			System.out.println("Friday");
		}
		else if(n==7)
		{
			System.out.println("Saturday");
		}
		else
		{
			 System.out.println("Please enter weekend day number between 1 to 7.");
		}
	}
}