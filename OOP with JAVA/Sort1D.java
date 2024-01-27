import java.io.*;
public class Sort1D
{
	public static void main(String [] arg)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int []a=new int[100];
		int i, j, n, temp=0; 
		System.out.println("How many elements you wants?");
		n=Integer.parseInt(br.readLine());
		System.out.println("Give "+n+" elements for array:");
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Orginal Array is : " +n);
		for(i=0; i<n; i++)
		{
			for(j=i+1; j<n; j++)
			{
				if(a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Sorted Element : ");
		for(i=0; i<n; i++)
		{
			System.out.println(a[i] + " ");
		}
	}
}