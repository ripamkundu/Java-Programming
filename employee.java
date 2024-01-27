class worker
{
	String name;
	int empno;
	worker(int no,String n)
	{ 	
		empno=no;	
		name=n; 
	}
	void show()
	{
		System.out.println("\n--------------------------");
		System.out.println("Employee number : "+empno);
		System.out.println("Employee name : "+name);
	}
}
class dailyworker extends worker
{
	int price;
	dailyworker(int no,String n,int p)
	{
		super(no,n);
		price=p;
	}
	void compay(int h)
	{
		show();
		System.out.println("Salary : "+price*h);
	}
}
class salariedworker extends worker
{
	int price;
	salariedworker(int no,String n,int p)
	{
		super(no,n);
		price=p;
	}
	int hour=40;
	void compay()
	{
		show();
		System.out.println("Salary : "+price*hour);
	}
}


public class employee
{
	public static void main(String args[])
	{
		dailyworker d=new dailyworker(350,"Manojoy",65);
		salariedworker s=new salariedworker(650,"vicky",100);
		
		dailyworker a=new dailyworker(400,"Ragul",60);
		salariedworker n=new salariedworker(600,"Babai",80);
		d.compay(45);
		s.compay();
		
		a.compay(65);
		n.compay();
	}
}