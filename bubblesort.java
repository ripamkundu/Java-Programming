import java.io.*;
public class bubblesort
{
	public static void main(String[]arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int []a=new int [100];
		int n,i,j,temp = 0;
		System.out.println("How Many Elements You Wants?");
		n=Integer.parseInt(br.readLine());
		System.out.println("Give " + n + " Elements For Array");
		for(i=0; i<n; i++)
		{
			System.out.println("Give Data For " + (i+1) + "Index");
			a[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Before sorting Array Elements Are:");
		for(i=0; i<n; i++)
		{
			System.out.print(a[i] + " ");
		}
		 
         System.out.println();  
         for( i=0; i < n; i++)
		 {  
                 for( j=1; j < (n-i); j++)
			{  
                          if(a[j-1] > a[j])
			  	{  
                                 
                                 temp = a[j-1];  
                                 a[j-1] = a[j];  
                                 a[j] = temp;  
                         	}  
			 }
		 }		 
		 System.out.println();  
		System.out.println("After sorting Array Elements Are:");
		for(i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}				 
                   
	}
}	