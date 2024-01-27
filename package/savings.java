package package1;

public class savings
{
	float p,s,d;
	public float deposit(float x,float y)
	{
		p=x;
		s=y;
		return (p+s);
	}
	public float withdrawal(float x,float y)
	{
		p=x;
		s=y;
		return (p-s);
	}
	public float interest(float x)
	{
		s=x;
		return((s*8)/100);
	}
}
