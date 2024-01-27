import java.io.*;
public class Area 
{
   public static void main (String[] args) throws IOException
    
   {
	   BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	   int i,n,a;
	   System.out.println("Enter the length of Rectangle:");
	   i=Integer.parseInt(br.readLine());
	   System.out.println("Enter the width of Rectangle:");
	    n=Integer.parseInt(br.readLine());
	   //Area = length*width;
	    a = i*n;
	   System.out.println("Area of Rectangle is:"+a);
   }
}
