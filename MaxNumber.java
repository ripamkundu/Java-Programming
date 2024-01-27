import java.io.*;

public class MaxNumber 
{
    public static void main(String args[]) 
	{
        
        int a = 5, b = 7,c = 6,d = 8,max;
        max = (a>b)&&(c>d)?((a>c)?a:c):((b>d)?b:d);
        
        System.out.println("Max is = " + max);
    }
}
