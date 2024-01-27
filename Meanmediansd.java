import java.io.*;
public class Meanmediansd
{
	public static void main(String [] arg)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int []a=new int[100];
		int i,n,sum=0,deviation,ssquare=0,mean,median,sd;
		System.out.println("Enter the number of elements in the array:");
		n=Integer.parseInt(br.readLine());
		for(i=0;i<n;i++)
		{
			System.out.println("Give data for "+(i+1)+"Index");
			a[i]=Integer.parseInt(br.readLine());
		}
		for(i=0;i<n;i++)
		sum+=a[i];
		mean=sum/n;
		System.out.println("Mean is:"+mean);
		if(n%2==1)
		{
			median=n/2;
		}
		else
		{
			median=(n-1)/2;
		}
		System.out.println("Median is:"+median);
		for(i=0;i<n;i++)
		{
			deviation=a[i]-mean;
			ssquare+=deviation*deviation;
		}
		variance=ssquare/n;
		sd=
	}
}
	