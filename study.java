import java.io.*;
public class study
{
	public static void main(String []arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int phy,che,bio,math,com,avg;
		System.out.println("Enter Number Of Subject ");
		
		System.out.println("Enter Number of Subject is Physics  : ");
		phy = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Number of Subject is Chemistry  : ");
		che = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Number of Subject is Biology  : ");
		bio = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Number of Subject is Mathematics : ");
		math = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Number of Subject is Computer Science : ");
		com = Integer.parseInt(br.readLine());
		
		avg=(phy + che + bio + math + com)/5;
		System.out.println("Total Marker Is : "+avg);
		if(avg>=90)
		{
			System.out.println("Grade : A");
		}
		else if(avg>=80 && avg<90)
		{
			 System.out.println("Grade : B");
		}
		else if(avg>=70 && avg<80)
		{
			 System.out.println("Grade : C");
		}
		else if(avg>=60 && avg<70)
		{
			System.out.println("Grade : D");
		}
		else if(avg>=40 && avg<60)
		{
			System.out.println("Grade : E");
		}   
		else
		{
			 System.out.println("Grade : F");
		}
	}
}