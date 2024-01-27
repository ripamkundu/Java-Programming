import java.io.*;

class Student
{
   Student()
   {
	   getmarks();
   }

public void getmarks()
	{
		
       for(i=0;i<3;i++)

       {
          Total+= marks[i];
       }

       System.out.println("Total Marks of student "+name+": " +Total);

   }

}

class Student_Marks

{
    public static void main(String [] args) throws IOException

    {
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int i,n,Reg, marks[],Total=0,subjects;
			String name;
			Student();
			{
				System.out.print("Enter Registration No.: ");
				Reg = Integer.parseInt(br.readLine());

				System.out.print("Enter Student Name: ");
				name = br.readLine();
				
				marks = new int[3];

				System.out.print("Enter marks of Physics: ");
				marks[0] = Integer.parseInt(br.readLine());

				System.out.print("Enter marks of Chemistry: ");
				marks[1] = Integer.parseInt(br.readLine());

				System.out.print("Enter marks of Maths: ");
				marks[2] = Integer.parseInt(br.readLine());
				
				 for(i=0;i<3;i++)
				Student s = new Student[n];

					for(i=0;i<n;i++)
				s[n] = new Student();
			}
    }
}