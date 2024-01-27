import java.io.*;
public class Sort
{
	public static void main(String [] arg)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i,n,temp,j;
		int []a=new int[100];
		System.out.println("How many elements you wants?");
		n=Integer.parseInt(br.readLine());
		System.out.println("Enter "+n+" elements for array:");
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("The array sorted in acsending order is:");
		for(i=0;i<n;i++)
		{
			System.out.println("   "+a[i]);
		}
		System.out.println("   ");
	}
}