import java.io.*;
public class Number
{
	public static void main(String [] arg)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int []a=new int[100];
		int i, n, odd, even;
		System.out.println("How many elements you wants?");
		n=Integer.parseInt(br.readLine());
		System.out.println("Give "+n+" elements for array:");
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		odd = 0; 
		even = 0;
		for(i=0;i<n;i++)
		{
			if(a[i] % 2 == 1)
			{
				odd++;
			}
			else
			{
				even++;
			}
		}
		System.out.println("Odd Number is : "+odd);
		System.out.println("Even Number is : "+even);
		
	}
}