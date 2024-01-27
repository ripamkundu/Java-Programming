import java.io.*;
public class Smallest1D
{
	public static void main(String [] arg)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int []a=new int[100];
		int n,i,l;
		System.out.println("How many elements you wants?");
		n=Integer.parseInt(br.readLine());
		System.out.println("Give "+n+" elements for array:");
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		l=a[0];
		for(i=0;i<n;i++)
		{
			if(a[i]<l)
			{
				l=a[i];
			}
		}
		System.out.println("Smallest value is:" +l);
	}
}