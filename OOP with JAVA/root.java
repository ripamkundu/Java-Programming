import java.io.*;
public class root
{
	public static void main (String [] arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i, n, sum =0 ;
		System.out.println("Enter a Number : ");
		n = Integer.parseInt(br.readLine());
		for (i = 1; i<=n; i++)
		{
			sum = sum  + i * i;
		}
		System.out.println("Result is : " +sum);
		
	}
}

