import java.io.*;
public class krishnomurti
{
   public static void main(String []arg) throws IOException
   {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 int i, m, n, s=0;
	 System.out.println("Enter a number: ");
	 n=Integer.parseInt(br.readLine());
	 System.out.println("\n");
	 m=n;
	 while(n>0)
	  
	  {
	     i=n%10;
             s=s+n;
             n=n/10;
		}
		if(s==m)
		{
		   System.out.println(m+"is a krishnamurthy number");
		}
		else
		{
		    System.out.println(m+"is not a krishnamurthy number");
		}
	}
}