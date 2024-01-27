import java.io.*;

public class maxmin
{
   public static void main(String []arg) throws IOException
  {
     BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
	 int []a= new int[100];
	 int n,i,j,t;
	 System.out.println("How many Element You Wamt");
	 n=Integer.parseInt(br.readLine());
	 System.out.println("Give"+ n +"Element For Array");
	 for(i=0;i<n;i++)
	 {
	    System.out.println("Gives Data for" +(i+1)+ "Index");
		a[i]=Integer.parseInt(br.readLine());
		
	 }
	 System.out.println("Array element are :");
	 for(i=0;i<n;i++)
	 {
	    System.out.println(a[i]);
	 }
	 for(i=0;i<n;i++)
	 {
	   for(j=0;j<n-i-1;j++)
	   {
	      if(a[j]>a[j+1])
		  {
		      t=a[j];
			  a[j]=a[j+1];
			  a[j+1]=t;
		  }
	   }
	 }
	 System.out.println("the minimum value is" +a[0]);
	 System.out.println("the maximum value is" +a[n-1]);
  }
  
}
    
