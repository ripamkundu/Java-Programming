import java.io.*;
public class perfect
{
  public static void main(String []arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n,i,sum=0;
	    System.out.println("Enter positive integer:");
        n=Integer.parseInt(br.readLine());
        for(i=1;i<=n/2;i++)
		{
            if(n%i == 0)
			{
                sum += i;
            }
        }
        if(sum==n)
		{
         System.out.println("This number is  perfect");
        }
       else
	   {
         System.out.println("This number is not  perfect");
        } 
   }
}   