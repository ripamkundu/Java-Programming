import java.io.*;


public class Str4
{
	public static void main(String []arg) throws IOException
	{
		String s1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Give Password");
		s1=br.readLine();
		 char s2[]={'A','D','M','I','N'};
		//s3=s1.equals(s2);
		if(s1.equals(s2))
		
			System.out.println("Authenticate User");
		
		else
		
			System.out.println("NOT VALID PASSWORD");
			
		
		
	}
}