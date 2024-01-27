import java.io.*;
public class sorting
{
  public static void main(String []arg) throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[]a=new int[100];
		int n,i,j,temp;
		System.out.println("How many element are you want");
		n=Integer.parseInt(br.readLine());
		System.out.println("Enter array element:");
		for(i=0;i<n;i++)
		{
		  a[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Befor sorting Array element is:");
		
		for(i=0;i<n;i++)
		{
		  System.out.println("Elements of " + i + " index is " +a[i]);
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
		System.out.println("After sorting array element is:");
		
		for(i=0;i<n;i++)
		{
		  System.out.println("Elements of " + i + " index is " +a[i]);
		}
	}
}
		