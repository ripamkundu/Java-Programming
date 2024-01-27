import java.io.*;

public class Math
{
    public static void main(String []args) throws IOException
	{
		int a=10,b=5;
		System.out.println(" i) (a<<2)+(b>>2): "+(a<<2)+(b>>2));
		System.out.println(" ii) (a)||(b>0) : " +((a!=0)||(b>0)));
		System.out.println("iii) (a+b*100)/10 : "+(a+b*100)/10 );
		System.out.println(" iv) (a&b) : "+(a&b) );
	}
}