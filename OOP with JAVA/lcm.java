import java.io.*;
public class lcm
{
  public static void main(String []arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
        int a, b, gcd=0,i, lcm = 0;
        System.out.println("Enter 1st Number:");
        a=Integer.parseInt(br.readLine());
	    System.out.println("Enter 2nd Number:");
        b=Integer.parseInt(br.readLine());

        for (i = 1; i <= a && i <= b; ++i)
	 {
        
        if (a % i == 0 &&b % i == 0)
            gcd = i;
    }
    lcm = (a*b) / gcd;

      System.out.println("LCM of given numbers is : "+lcm); 
    
   }
}   