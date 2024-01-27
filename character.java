import java.io.*;
public class character
{
	public static void main(String []arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		char n;
		System.out.println("Enter Any Alphabet & Digit & Special Character : ");
		n = br.readLine();
		 
		if((n >= 'a' && n <= 'z') || (n >= 'A' && n <= 'Z'))
		{
			System.out.println("The Alphabet Character :  "+n);
		}
		else if(n >= '0' && n <= '9')
		{
			System.out.println("The Digit Character : "+n);
		}
		else
		{
			System.out.println("The Special Character "+n);	
		}
	}
}