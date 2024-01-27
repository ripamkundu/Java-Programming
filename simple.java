import java.io.*;
public class calculate
{
	public static void main(String []arg) throws IOException
	{
		BufferReadered br = new BufferReadered(new InputStreamReadered (System.in));
		int n,p,t,r;
		System.out.println("Enter Principal : ");
		p = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Time : ");
		t = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Rate : ");
		r = Integer.parseInt(br.readLine());
		
		n = (p*t*r)/10;
		System.out.println("Simple Intarest Is : "+n);
		
	}
}