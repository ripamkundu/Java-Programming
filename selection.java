import java.io.*;

public class selection
{
public static void main(String []arg) throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ar[100], n, c, d, pos,swap;
		System.out.println("Enter the number of element :");
		n=Integer.parseInt(br.readLine());
		for(c=0;c<n;c++)
		{
		   ar[c]=Integer.parseInt(br.readLine());
		}
		for(c=0;c<n-1;c++)
		{
		 pos=c;
		 for(d=c+1;d<n;d++)
		 {
		   if(ar[pos]>ar[d])
		   {
		     pos=d;
		   }
		 }
		 if(pos!=c)
		 {
		   swap=ar[c];
		   ar[c]=ar[pos];
		   ar[pos]=swap;
		 }
		}
		System.out.println("Soretd Array");
		for(c=0;c<n;c++)
		{
		    ar[c]=Integer.parseInt(br.readLine());
		}
	}	
}	