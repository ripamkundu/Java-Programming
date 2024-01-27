import java.io.*;

public class sum
{
	public static void main(String []arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int [][]a = new int[100][100];
		int [][]t = new int[100][100];
		int r,c,i,j,sum=0;
		
		System.out.println("How Many Rows And Columns You Wants Of a Matrix?");
		r=Integer.parseInt(br.readLine());
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
		for(i=0;i<r;i++)
		{ 
			for(j=0;j<c;j++)
			{ 
				if(i==j) 
				{
					sum = sum + a[i][j];
				}
			}
		}
		System.out.println("Sum of Diogonal Value:"+sum);
	}
}