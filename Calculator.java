import java.io.*;
 
public class Calculator
{
    public static void main(String []args) throws IOException
    {
        int arr[] = new int[5];
        int i;
        float sum=0;
        float average;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        System.out.print("Enter marks for Subjects : ");
        for(i=0; i<5; i++)
		{
            arr[i] = Integer.parseInt(br.readLine());
            sum = sum + arr[i];
        }
		
        average = sum/5;
        
		
        System.out.print("Average Marks = " +average);
		
      
    }
}