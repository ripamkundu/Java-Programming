import java.io.*;

public class diagon
{
	public static void main(String []arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int [][]a = new int[100][100];
		int r,sum=0,i,j;
		
		System.out.println("How Many Rows And Columns You Wants Of a Matrix?");
		r=Integer.parseInt(br.readLine());
		System.out.println("Give " + r + " Rows and " + r + " Columns Values:");
		
		for(i=0; i<r; i++)
		{
			for(j=0; j<r; j++)
			{
				a[i][j]=Integer.parseInt(br.readLine());
			}
		}
		
		System.out.println("Matrix Elements Are:");
		for(i=0; i<r; i++)
		{
			for(j=0; j<r; j++)
			{
				System.out.print(" " +a[i][j]);
			}
			System.out.println();
		}
		
		for(i=0;i<r;i++)
		{
			sum+=a[i][i];
		}
		System.out.println("Addition of diagon is:"+sum);
		
		
		
	}
}