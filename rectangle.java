import java.io.*;
public class rectangle
{
	public static void main(String []arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int l,w,n;
		System.out.println("Enter Length Of rectangle : ");
		l = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Width Of rectangle : ");
		w = Integer.parseInt(br.readLine());
		
		n = l * w;
		System.out.println("Area of rectangle is : "+n);
		
	}
}