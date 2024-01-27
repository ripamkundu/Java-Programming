import java.io.*;
public class secondLargest
{
  public static void main(String []arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int a,b,c;
		System.out.println("Enter three integer");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		c=Integer.parseInt(br.readLine());
		if(a>b&&a>c)
		{
			if(b>c)
				System.out.println(b+"is the secound largest ");
			else
				System.out.println(c+"is the secound largest ");
		}
        else if (b>a&&b>c)
	    {
            if(a>c)
				System.out.println(a+"is the secound largest ");
			else
				System.out.println(c+"is the secound largest "); 			
				
        }
		else
		{	
		    if(a>b)
				System.out.println(a+"is the secound largest ");
			else
				System.out.println(b+"is the secound largest "); 
        }			
    }
}   