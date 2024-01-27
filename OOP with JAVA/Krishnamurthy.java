import java.io.*;
public class Krishnamurthy
{
  public static void main(String []arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n, temp, sum, current, fact;
	    System.out.println("Enter an Integer: ");
	    n=Integer.parseInt(br.readLine());
        temp = n;
        sum = 0;

        while(temp!=0)
          {
            current  = temp % 10;
            fact = 1;
            for(int i=1; i<=current; i++)
             {
               fact *= i;
              }

            sum += fact;
            temp /= 10;
          }

        if(sum == n)
         {
           System.out.println(" Krishnamurthy Number.");
         }
        else
         {
           System.out.println(" not a Krishnamurthy Number.");
         }

    }
}   