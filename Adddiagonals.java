import java.io.*;
public class Adddiagonals
{
	public static void main(String [] arg)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a[][]=new int[100][100];
		int r,c,i,j,add=0;
		System.out.println("How many rows and columns you wants?");
		r=Integer.parseInt(br.readLine());
		c=Integer.parseInt(br.readLine());
		System.out.println("Give "+r+" rows and "+c+" columns values for array:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=Integer.parseInt(br.readLine());
			}
		}
		System.out.println("Array elements are:");
		for(i=0;i<r;i++)
		{
			System.out.println("   ");
			for(j=0;j<c;j++)
			{
				System.out.print("\t" +a[i][j]);
			}
		}
		System.out.println("Array elements are:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				if(i==j)
				{
					System.out.print("\t" +a[i][j]);
					add=add+a[i][j];
					System.out.println("Sum of diagonals elements is:"+add);
				}
			}
		}
	}
}

