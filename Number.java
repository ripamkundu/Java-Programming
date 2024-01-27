import java.io.*;
import java.util.*;

class Student

{

   Scanner sc=new Scanner(System.in);

   int Reg,Total=0,subjects;

   String name;

   int marks[];

   Student()

   {

      System.out.print("Enter Registration No.->");

      Reg=sc.nextInt();

      System.out.print("Enter Student Name -> ");

      name=sc.next();;

      getMarks();

   }

   public void getMarks()

   {

	marks=new int[4];

	System.out.print("Enter marks of DBMS : ");
	marks[0]=sc.nextInt();

	System.out.print("Enter marks of PYTHON : ");
	marks[1]=sc.nextInt();

	System.out.print("Enter marks of MATHS : ");
	marks[2]=sc.nextInt();
	   
	System.out.print("Enter marks of JAVA  : ");
	marks[3]=sc.nextInt();

       for(int i=0;i<4;i++)

       {

          Total+=marks[i];

       }

       System.out.println("Total Marks of student "+name+": " +Total);

   }

}

public class Number

{

    public static void main(String args[])

    {

        Student s[]=new Student[5];

        for(int i=0;i<5;i++)

              s[i]=new Student();

     }

}