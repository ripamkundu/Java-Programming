import java.io.*;
public class Search_Element
{
	public static void main(String [] arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n,j, l, f = 0, i = 0;
		System.out.print("Enter no. of elements you want in array :");
		n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for(i = 0; i < n ; i++)
		{
			a[i] = Integer.parseInt(br.readLine());
		}
		System.out.print("Enter the element you want to find:");
		j = Integer.parseInt(br.readLine());
		for(i = 0; i < n; i++)
		{
			if(a[i] == j)
			{
				f = 1;
				break;
			}
			else
			{
				f = 0;
			}
		}
		if(f == 1)
		{
			System.out.println("Element found at position:"+(i + 1));
		}
		else 
		{
			System.out.println("Element not found");
		}
    }
}