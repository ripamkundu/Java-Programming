import java.io.*;

public class transpose
{
	public static void main(String []arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int [][]a = new int[100][100];
		int r,c,sum=0,i,j;
		
		System.out.println("How Many Rows You Wants Of a Matrix?");
		r=Integer.parseInt(br.readLine());
		System.out.println("How Many Columns You Wants Of a Matrix?");
		c=Integer.parseInt(br.readLine());
		System.out.println("Give " + r + " Rows and " + c + " Columns Values:");
		
		for(i=0; i<r; i++)
		{
			for(j=0; j<c; j++)
			{
				a[i][j]=Integer.parseInt(br.readLine());
			}
		}
		
		System.out.println("Matrix Elements Are:");
		for(i=0; i<r; i++)
		{
			for(j=0; j<c; j++)
			{
				System.out.print(" " +a[i][j]);
			}
			System.out.println();
		}
		
		
		System.out.println("Transpose Matrix is:");
		for(i=0; i<c; i++)
		{
			for(j=0; j<r; j++)
			{
				System.out.print(" " +a[j][i]);
			}
			System.out.println();
		}
	}
}
		