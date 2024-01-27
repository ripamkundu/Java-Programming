import java.io.*;

class Rect

{

	double width,length,area;

	String color;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	Rect()

   {  

   System.out.print("Enter the length: ");

   length=Integer.parseInt(br.readLine());

   System.out.print("Enter the width: ");

   width=Integer.parseInt(br.readLine()); 

   System.out.print("Enter the color: ");

    color= Integer.parseInt(br.readLine());

    area=length*width;

    System.out.println("Area of Rectangle: "+area);

   }

}

public class color

{

   public static void main(String []args)throws IOException

   {

   System.out.println("First Rectangle: ");

   Rect r1=new Rect();

   System.out.println("Second Rectangle: ");

   Rect r2=new Rect();

   if(r1.area==r2.area && r1.color.equals(r2.color))
    {
          System.out.println("Matching Rectangle ");
    }
   else
    {
          System.out.println("Non Matching Rectangle ");
    }
   }

} 
