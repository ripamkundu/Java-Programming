class Math
{
	static double mul(double x, double y)
	{
		return (x * y);
	}
	static double div(double x, double y)
	{ 
		return (x/ y);
	}
}
public class Math_new
{
	public static void main(String [] arg)
	{
		double a , b;
		a = Math.mul(12.55, 20.5);
		System.out.println("Multiplication : "+a);
		
		b = Math.div(19.75, 8.75);
		System.out.println("Division : "+b);
	}
}