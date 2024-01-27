import java.io.*;
public class mmsd
{
    public static void main(String []arg) throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i,n,j,sum=0,mean,median,sdsum=0,temp;
		int []a=new int[100];
		System.out.println("Enter how many element are you want ");
		n=Integer.parseInt(br.readLine());
		System.out.println("Enter array element:");
		for(i=0;i<n;i++)
		{
		  a[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println(" Array element is:");
		
		for(i=0;i<n;i++)
		{
		  System.out.println("Elements of " + i + " index is " +a[i]);
		  sum+=a[i];
		}
		mean=sum/n;
		
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
		
		
		if(n%2==0)
		{
			median=(a[(n-1)/2] + a[n/2])/2;
		}
		else
			median=a[n/2];
		
		for(i=0;i<n;i++)
		{
			sdsum+=(mean-a[i])*(mean-a[i]);
			
		}
		
		
		System.out.println("MEAN:"+mean);
		System.out.println("MEDIAN:"+median);
		System.out.println("STANDARD DEVIATION:"+Math.sqrt(sdsum));
	}
}