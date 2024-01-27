import java.io.*;
public class farenhight
{
	public static void main(String []arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int n,f;
		System.out.println("Enter the temparature in celcius : ");
		n = Integer.parseInt(br.readLine());
		
		f =  (n*1.8) + 32;
		System.out.println("Temperature in Farenheit is : "+f);
		
	}
}