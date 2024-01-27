import java.io.*;
public class Diagonal
{
	public static void main(String [] arg)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int [][]a=new int[100][100];
		int n,i,j,r,c,sum=0;
		System.out.println("Enter the number of Row : ");
		r=Integer.parseInt(br.readLine());
		System.out.println("Enter the number of column : ");
		c=Integer.parseInt(br.readLine());
		System.out.println("Enter the elements of the matrix");
		for(i=0; i<r; i++)
		{
			for(j=0; j<c; j++)
			{
				a[i][j] = Integer.parseInt(br.readLine());
			}
		}
		System.out.println("The elements of the matrix");
		for(i=0; i<r; i++)
		{
			for(j=0; j<c; j++)
			{
				System.out.println(a[i][j]+" ");
			}
			System.out.println(" ");
		}
		for(i=0; i<r; i++)
		{
			for(j=0; j<c; j++)
			{
				if(i == j)
				{
					sum = sum + a[i][j];
				}
			}
		}
		System.out.printf("Sum of Diagonal elements of the matrix = "+sum);
	}
}
