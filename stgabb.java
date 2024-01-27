import java.io.*;


public class stgabb
{
	public static void main(String []arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1,s2,s3; 
		
		System.out.println("Give First Name:");
		s1=br.readLine();
		System.out.println("Give Last Name:");
		s2=br.readLine();
		s3=s1.charAt(0)+" "+s2; 
		System.out.println("Name is =" +s3);
	}
}
		