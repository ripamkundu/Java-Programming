class Box
{
	int h, w, d;
	Box(int hight, int width, int depth)
	{
		h = hight;
		w = width;
		d = depth;
	}
	Box()
	{
		h = w = d;
	}
	Box(int len)
	{
		h = w = d= len;
	}
	int volume()
	{
		return h*w*d;
	}
}
public class large_Box
{
	public static void main (String [] arg)
	{
		Box ob = new Box(10, 25, 15);
		Box ob1 = new Box();
		Box ob2 = new Box(25);
		int v, v1, v2;
		v = ob.volume();
		System.out.println("Volume Is :"+v);
		
		v1 = ob1.volume();
		System.out.println("Volume Is :"+v1);
		
		v2 = ob2.volume();
		System.out.println("Volume Is :"+v2);
	}
}