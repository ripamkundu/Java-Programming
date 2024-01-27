import java.io.*;
public class triangle
{
	public static void main(String []arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int x,y,z;
		System.out.println("Enter lengths of the triangle sides:");
		System.out.println("Enter Frist Number : ");
		x = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Second Number : ");
		y = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Third Number : ");
		z = Integer.parseInt(br.readLine());
		if ((x == y) && (y == z))
		{
			System.out.println("Equilateral triangle");
		}
		else if ((x==y) && (y==z) && (z==x))
		{
			System.out.println("isosceles triangle");
		}
		else
		{
			System.out.println("Scalene triangle");
		}
	}
}