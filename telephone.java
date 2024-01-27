import java.io.*;

class call
{
	float dur;
	String type;
	float rate()
	{
		if(type.equals("urgent"))
		return 4.5f;
		else if(type=="lightning")
		return 3.5f;
		else
		return 3f;
	}
}
class bill extends call
{
	float amount;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	bill()
	{
		try
		{
			in= new InputStreamReader(System.in);
		}
	}
	catch(Exception e)
	{ 
		System.out.println(e); 
	}
}
void read()throws Exception
{
	String s;
	System.out.println("enter call type(urgent,lightning,ordinary):");
	type= Integer.parseInt(br.readLine());
	System.out.println("enter call duration:");
	s= Integer.parseInt(br.readLine());
	dur=Float.valueOf(s).floatValue();
}
void calculate()
{
	if(dur<=1.5)
	amount=rate()*dur+1.5f;
	else if(dur<=3)
	amount=rate()*dur+2.5f;
	else if(dur<=5)
	amount=rate()*dur+4.5f;
	else
	amount=rate()*dur+5f;
}
void print()
	{
	
	System.out.println(" PHONE BILL ");
	System.out.println("___________________");
	System.out.println(" Call type : "+type);
	System.out.println(" Duration : "+dur);
	System.out.println(" CHARGE : "+amount);
	
	}

public class telephone
{
	public static void main(String[] arg)throws Exception
	{
		bill b=new bill();
		b.read();
		b.calculate();
		b.print();
	}
}