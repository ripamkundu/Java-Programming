import java.io.*;

public class password
{
	public  static void main(String []arg) throws IOException
	{
		String s1,s2;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Acctual Password : ");
		s1=br.readLine();
		System.out.println("Enter your password :");
		s2=br.readLine();
		if(s1.equals(s2))
		{
			System.out.println("Your password is valid");
		}
		else
		{
			System.out.println("Your password is wrong");
		}
	}
}