import java.io.*;
public class GCD
{
  public static void main(String []arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
      int a, b,c, gcd;
      System.out.println("Enter 1st Number:");
      a=Integer.parseInt(br.readLine());
	  System.out.println("Enter 2nd Number:");
      b=Integer.parseInt(br.readLine());
	  System.out.println("Enter 3rd Number:");
      c=Integer.parseInt(br.readLine());
	  if(a>=b&&a>=c)
	  {
	    gcd=a;
		}
	  else
	  {
	    if(b>=c)
		  gcd=b;
		else
		  gcd=c;
	   }
	   while(a%gcd!=0 ||b%gcd!=0||c%gcd!=0)
	   {
	     gcd--;
		 }

      System.out.println("GCD of given numbers is : "+gcd); 
    
    }
}   