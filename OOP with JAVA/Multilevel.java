class student
{
	int roll;
	student()
	{
		roll = 5;
	}
}
class Exam extends student
{
	double x, y;
	Exam()
	{
		x = 9.51;
		y = 9.86;
	}
}
class Result extends Exam
{
	double total, cgpa;
	void display()
	{
		total = x + y;
		cgpa = total / 2;
		System.out.println("Markes Obtain :");
		System.out.println("Roll No : "+roll);
		System.out.println("Sem 1 :"+x);
		System.out.println("Sem 2 :"+y);
		System.out.println("Total Marks :"+total);
		System.out.println("CGPA :"+cgpa);
		
	}
}
public class Multilevel
{
	public static void main (String [] arg)
	{
		Result ob = new Result();
		ob.display();
	}
}


