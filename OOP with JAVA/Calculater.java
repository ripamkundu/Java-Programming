import java.io.*;

public class Calculater
{
	public static void main(String []arg) throws IOException
	{
		int a,b,r,ch;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Two Values:");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		do
		{
			System.out.println("Let's see, what you want");
			System.out.println("Press 1 for +");
			System.out.println("Press 2 for -");
			System.out.println("Press 3 for *");
			System.out.println("Press 4 for /");
			System.out.println("Press 0 for exit");
			System.out.println("Enter Your Choice");
			ch = Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1: r = a + b;
						System.out.println("Result = " +r);
						break;
				case 2: r = a - b;
						System.out.println("Result = " +r);
						break;
				case 3: r = a * b;
						System.out.println("Result = " +r);
						break;
				case 4: r = a / b;
						System.out.println("Result = " +r);
						break;
				case 0: System.out.println("The End");
						break;
				default: System.out.println("Invalid Choice");
				break;
			}
		}while(true);
			
	}
}