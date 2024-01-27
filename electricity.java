import java.io.*;
public class electricity
{
	public static void main(String []arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int n,pay;
		System.out.println("Electicity Unit & Bil Detalis");
		System.out.println("Enter the number of electricity Units in a month : ");
		n = Integer.parseInt(br.readLine());
		if(n<50)
		{
			pay=n*0.50;
		}
		else if(n<100)
		{
			pay=50*0.50+(n-100)*1.20;
		}
	    else if(n>250)
		{
			pay=50*0.50+100 *1.20+(n-250)*1.50;
		}
		System.out.println("Bill to pay : "+pay);
	}
}