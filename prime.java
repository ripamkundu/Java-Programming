import java.io.*;
public class prime
{
  public static void main(String []arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n,i,flag=0;
	    System.out.println("Enter positive integer:");
        n=Integer.parseInt(br.readLine());
        for(i=2;i<=n/2;++i)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
       if(flag==1)
	   {
       System.out.println("This number is not prime");
       }
       else
	   {
       System.out.println("This number is prime");
       } 
   }
}   