import java.io.*;
public class Sum_Average
{
	public static void main(String [] arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, sum = 0;
		double average;
		System.out.print("Enter no. of elements you want in array :");
		n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for(int i = 0; i < n ; i++)
		{
			a[i] = Integer.parseInt(br.readLine());
			sum = sum + a[i];
		}
		System.out.println("Sum Is :" +sum);
		average = (float)sum / n;
		System.out.println("Average is :" +average);
    }
}