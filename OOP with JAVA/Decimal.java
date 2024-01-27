import java.io.*;
public class Decimal
{
	public static void main(String [] arg)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int d, n, j, i= 1;
		int [] b = new int[100];
		System.out.println("Enter a Decimal Number : ");
		d = Integer.parseInt(br.readLine ());
		n = d;
		while(n != 0)
		{
			b [i+1] = n %2;
			n = n/2;
		}
		System.out.println("Binary Number Is : ");
		for(j = i -1; j>0; j--)
		{
			System.out.println(b[j]);
		}
		System.out.println("\n");
	}
}