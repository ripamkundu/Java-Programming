package package1;
import java.io.*;

public class savings
{
	float p,s,d;
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in)); 
	public float deposit(float x,float y)
	{
		System.out.println("Enter main balance :");
		x=interger.parseInt(br.readLine());
		
		System.out.println("Enter the deposit balace :");
		y=interger.parseInt(br.readLine());
		p=x;
		s=y;
		d= p+s;
		return d;
	}
	public float withdrawal(float x,float y)
	{
		System.out.println("Enter main balance :");
		x=interger.parseInt(br.readLine());
		
		System.out.println("Enter the Amount :");
		y=interger.parseInt(br.readLine());
		p=x;
		s=y;
		d= p-s;
		return d;
	}
	public float interest(float x)
	{
		s=x;
		return((s*8)/100);
	}
	public float balance()
	{
		return ;
	}	
} 
