class Box
{
	int h, w, d;
	Box(int hight, int width, int depth)
	{
		h = hight;
		w = width;
		d = depth;
	}
	int volume()
	{
		return h*w*d;
	}
}
public class MyBox
{
	public static void main (String [] arg)
	{
		Box ob = new Box(10, 25, 15);
		int v;
		v = ob.volume();
		System.out.println("Volume Is :"+v);
	}
}