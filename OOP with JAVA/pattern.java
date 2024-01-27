import java.io.*;
public class pattern
{
	public static void main (String [] arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i, j, n = 5 ;
		for (i = 5; i>=n; --i)
		{
			for (j =5; i<= i ; j++)
				System.out.println("*");
		}
		System.out.println();
		
	}
}