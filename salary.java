import java.io.*;
public class salary
{
	public static void main(String []arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int n,hra,da,gross;
		System.out.println("Employee Salary Detalis");
		System.out.println("Enter Basic Salary : ");
		n = Integer.parseInt(br.readLine());
		
		if(n<=10000)
		{
			hra = (n*20)/100;
			da = (n*80)/100;
			gross = n + hra + da;
			
			System.out.println("HRA is : "+hra);
			System.out.println("DA is : "+da);
			System.out.println("Gross Salary : "+gross);
		}
		else if(n<=20000)
		{
			hra = (n*25)/100;
			da = (n*90)/100;
			gross = n + hra + da;
			
			System.out.println("HRA is : "+hra);
			System.out.println("DA is : "+da);
			System.out.println("Gross Salary : "+gross);
		}
		else if(n>=20000)
		{
			hra = (n*30)/100;
			da = (n*95)/100;
			gross = n + hra + da;
			
			System.out.println("HRA is : "+hra);
			System.out.println("DA is : "+da);
			System.out.println("Gross Salary : "+gross);
		}
		else
		{
			System.out.println("Enter salary!");
		}
	}
}