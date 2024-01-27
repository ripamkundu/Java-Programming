import java.io.*;

public class armstrong 
{
	public static void main(String []arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n,r,current,sum=0;
		System.out.println("Enter a number");
		n=Integer.parseInt(br.readLine());
		current=n;
		while(n!=0)
		{
			r=n%10;
			sum+=Math.pow(r,3);
			n/=10;
		}
		if(sum==current)
			System.out.println(current+" is armstrong");
		else
			System.out.println(current+"is not armstrong");
		
		
			
	}
}