import java.io.*;
public class sum
{
   public static void main(String []arg) throws IOException
   {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int [][]a = new int[100][100];
	   int [][]b = new int[100][100];
	   int [][]c = new int[100][100];
	   int a, b, c, m, n, p, q, i, j, k;
	   System.out.println("Enter Number of row in 1st Matrix : ");
	   m=Integer.parseInt(br.readLine());
	   System.out.println("Enter Number of Column in 1st Matrix : ");
	   n=Integer.parseInt(br.readLine());
	   System.out.println("Give" + m + "Rows and" + n + "columns value");
	   
	   System.out.println("Enter Number of row in 2nd Matrix : ");
	   p=Integer.parseInt(br.readLine());
	   System.out.println("Enter Number of Column in 2nd Matrix : ");
	   q=Integer.parseInt(br.readLine());
	   System.out.println("Give" + p + "Rows and" + q + "columns value");
	   
	   if(n==p)
	   {
		   System.out.println("\n The 1st matrix is: ");
		   for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					a[i][j]=Integer.parseInt(br.readLine());
				}
			}
			System.out.println("\n The 2nd matrix is: ");
			for(i=0;i<p;i++)
			{
				for(j=0;j<q;j++)
				{
					b[i][j]=Integer.parseInt(br.readLine());
				}
			} 
			System.out.println("\n The matrix Result is: ");
			for(i=0;i<m;++i)
			{
				for(j=0;j<q;++j)
				{
					c[i][j]=Integer.parseInt(br.readLine());
				{
				for(k=0;k<n;++k)
				{
					c[i][j]= a[i][j] + b[i][j];
				}
				System.out.print(" "+c[i][j]);
			}
		}
		else
		{
			System.out.println("\n matrix multiplication can't be done..!");	
		}
	System.out.println();	
	}
}
				
   