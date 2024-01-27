import java.io.*;

class Box
{
    private double length = 1.0;
    private double width = 1.0;
    private double height = 1.0;

    public Box (double l, double w, double h)
    {
        setLength(l);
        setWidth(w);
        setHeight(h);
    }

    public void setLength(double l)
    {
        if(l > 0)
        {
            length = l;
        }
        else
        {
            length = 1.0;
        }
    }

    public void setWidth(double w)
    {
        if(w > 0)
        {
            width = w;
        }
        else
        {
            width = 1.0;
        }
    }

    public void setHeight(double h)
    {
        if(h > 0)
        {
            height = h;
        }
        else
        {
            height = 1.0;
        }
    }

    public double calculateArea(double length, double width)
    {
        return (length*width);
    }

    public double calculateVolume(double length, double width, double height)
    {
        return (length*width*height);
    }

    public String getLength()
    {
        return String.format("%f", length);
    }

    public String getWidth()
    {
        return String.format("%f",width);
    }

    public String getHeight()
    {
        return String.format("%f",height);
    }   

    public String toString()
    {
        return String.format("Length is %s.\nWidth is %s.\nHeight is %s.\n", getLength(), getWidth(), getHeight());
    }
}
	
public class test
{
    public static void main(String[] args) throws IOException
    {       
        double l;
        double w;
        double h;

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] boxes = new int[4];
       
	   System.out.print ("Enter the length of your box:");
        l= Integer.parseInt(br.readLine());
       
	   System.out.print ("Enter the width of your box:");
        w= Integer.parseInt(br.readLine());
        
		System.out.print ("Enter the height of your box:");
        h= Integer.parseInt(br.readLine());

        Box boxOne = new Box(l, w, h);
        System.out.println(boxOne.toString());
        System.out.printf("The surface area of the box is %f.\nThe volume of the box is %f.\n", boxOne.calculateArea(l, w), boxOne.calculateVolume(l, w, h));
    }
}