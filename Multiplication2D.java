import java.io.*;
public class Multiplication2D
{
	public static void main(String [] arg)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a[][]=new int[100][100];
		int b[][]=new int [100][100];
		int c[][]=new int [100][100];
		int i,j,k,r1,r2,c1,c2,rows,cols;
		System.out.println("How many rows in the 1st & 2nd matrix you wants?");
		r1=Integer.parseInt(br.readLine());
		r2=Integer.parseInt(br.readLine());
		System.out.println("How many columns in the 1st & 2nd matrix you wants?");
		c1=Integer.parseInt(br.readLine());
		c2=Integer.parseInt(br.readLine());
		if(c1!=r2)
		{
			System.out.println("The number of columns in the 1st matrix must be equal to the number of rows in the 2nd matrix");
		}
		rows=r1;
		cols=c2;
		System.out.println("Enter values for 1st matrix:");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				a[i][j]=Integer.parseInt(br.readLine());
			}
		}
		System.out.println("Enter values for 2nd matrix:");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				b[i][j]=Integer.parseInt(br.readLine());
			}
		}
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{
				c[i][j]=0;
				for(k=0;k<cols;k++)
				c[i][j]+=a[i][k]*b[k][j];
			}
		}
		System.out.println("The product matrix are:");
		for(i=0;i<rows;i++)
		{
			System.out.println("    ");
			for(j=0;j<cols;j++)
			System.out.print("\t" +c[i][j]);
		}
	}
}
		