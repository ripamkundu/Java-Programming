import java.io.*;
public class largsmall
{
   public static void main(String []arg) throws IOException
    { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int []a=new int[100];
	    int i,n,j,temp;
	    System.out.println("Enter how many elements are you want :");
	    n=Integer.parseInt(br.readLine());
	    System.out.println("Enter array elements:");
	    for(i=0;i<n;i++)
	    {
	       a[i]=Integer.parseInt(br.readLine());
	    }
	    System.out.println("Array elements is :");
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
		System.out.println("largest value is:" +a[n-1]);
		System.out.println("smallest value is:" +a[0]);
	}
}
				
		