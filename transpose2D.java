import java.io.*;

public class transpose2D
{
    public static void main(String []arg) throws IOException
    {
	      BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		  int [] []a = new int [100] [100];
		  int r,c,i,j, sum=0;
		  System.out.println("How msny element you want :");
		  r=Integer.parseInt(br.readLine());
		  c=Integer.parseInt(br.readLine());
		  System.out.println("Give" + r +"rows and"+ c +"columns value: ");
		  for(i=0;i<r;i++)
		  {
		     for(j=0;j<c;j++)
			 {
			     a[i][j]=Integer.parseInt(br.readLine());
			 }
		  }
		  System.out.println("marix element are :");
		  for(i=0;i<r;i++)
		  {
		      for(j=0;j<c;j++)
			  {
			     System.out.print(" "+ a[i][j]);
			  }
			  System.out.println();
		  }
	}
}