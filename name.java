import java.io.*;

public class name
{
	public  static void main(String []arg) throws IOException
	{
		String s1,s2,s3,s4;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Give the First name : ");
		s1=br.readLine();
		System.out.println("Give the Middle name : ");
		s2=br.readLine();
		System.out.println("Give the last name : ");
		s3=br.readLine();
		System.out.println("The Full Name Is : " + s1 +"." + s2 +"."+s3);
		System.out.println("your Name is : "+s1.charAt(0)+ " " +s2.charAt(0)+ " "+s3);

	}
}