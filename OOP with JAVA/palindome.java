import java.io.*;
public class palindome
{
	public static void main(String []arg) throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	    String s1,s2="";
		int i,n;
	    System.out.println("Enter string:");
	    s1=br.readLine();
	    n=s1.length();
	 
	    for(i=n-1;i>n;i--)
	    {
		   s2+=s1.charAt(i);
	    }
	    if(s2.equals(s1))
		   System.out.println("String is palindome");
	    else
		   System.out.println("String is not palindome");
	   
	}
}
	