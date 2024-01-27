class A
{
	int x;
	A(int x)
	{
		this.x = x;
	}
	void show()
	{
		System.out.println("From Super Class : "+x);
	}
}
class B extends A
{
	int y;
	B(int x, int y)
	{
		super(x);
		this.y = y;
	}
	void show()
	{
		System.out.println("From Super Class : "+x);
		System.out.println("From Sub Class : "+y);
	}
}
public class Method
{
	public static void main(String []arg)
	{
		B ob = new B(150,250);
		ob.show();
	}
}