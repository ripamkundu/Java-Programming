import java.io.*;

public class matrix
{
   public static void main(String []arg) throws IOException
   {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int [][]a = new int[100][100];
	   int a, b, c, m, n, p, q, i, j, k;
	   System.out.println("How mnay Rows and Column you want of the 1st matrix?");
	   m=Integer.parseInt(br.readLine());
	   n=Integer.parseInt(br.readLine());
	   System.out.println("Give" + m + "Rows and" + n + "columns value");
	   
	   System.out.println("How mnay Rows and Column you want of the 2nd matrix?");
	   p=Integer.parseInt(br.readLine());
	   q=Integer.parseInt(br.readLine());
	   System.out.println("Give" + p + "Rows and" + q + "columns value");
	   
	   if(n==p)
		   
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
			 c[i][j]=c[i][j]+(a[i][j]*b[i][j]);
			 
			 System.out.print(" "+c[i][j]);
			 
		   }
		   
		 }
		 System.out.println();
	   }
	 else
	System.out.println("\n matrix multiplication can't be done:");	 
   }
}
   