import java.io.*;


public class Str3
{
	public static void main(String []arg) throws IOException
	{
		String s1,s2,s3;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Give First Name:");
		s1=br.readLine();
		System.out.println("Give Last Name:");
		s2=br.readLine();
		s3=s1.substring(0,1);
		System.out.println("Your Name is:" + s3 + " " +s2);
		
	}
}