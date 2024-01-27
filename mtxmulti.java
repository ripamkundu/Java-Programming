import java.io.*;

public class mtxmulti
{
	public static void main(String []arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int [][]a = new int[100][100];
		int [][]b = new int[100][100];
		int [][]d = new int[100][100];
		int r1,c,c2,i,j,k,sum;
		
		System.out.println("How Many Rows And Columns You Wants Of 1st Matrix?");
		r1=Integer.parseInt(br.readLine());
		c=Integer.parseInt(br.readLine());
		System.out.println("Give " + r1 + " Rows and " + c + " Columns Values:");
		
		for(i=0; i<r1; i++)
		{
			for(j=0; j<c; j++)
			{
				a[i][j]=Integer.parseInt(br.readLine());
			}
		}
		
		System.out.println("1st Matrix Elements Are:");
		for(i=0; i<r1; i++)
		{
			for(j=0; j<c; j++)
			{
				System.out.print(" " +a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("How Many Rows  You Wants Of 2nd Matrix?");
		
		c2=Integer.parseInt(br.readLine());
		System.out.println("Give " + c + " Rows and " + c2 + " Columns Values:");
		
		for(i=0; i<c; i++)
		{
			for(j=0; j<c2; j++)
			{
				b[i][j]=Integer.parseInt(br.readLine());
			}
		}
		
		System.out.println("2nd Matrix Elements Are:");
		for(i=0; i<c; i++)
		{
			for(j=0; j<c2; j++)
			{
				System.out.print(" " +a[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		System.out.println("Multiplying the matrices : ");
        for(i = 0; i < r1; i++)
       {
            for(j = 0; j < c2; j++)
            {
				sum=0;
                for(k = 0; k <c; k++)
                {
                    sum=sum+a[i][k]*b[k][j];
                }
				d[i][j]=sum;
				
            }
        }
        System.out.println("Product :");
        for (i = 0; i < r1; i++)
       {
            for(j = 0; j < c2; j++)
            {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
	    
		
	}
}