import java.io.*;
public class Stack
{
	public static void main(String [] arg)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int []stk=new int[100];
		int i, j, n, temp=0;
		Stack s = new Stack();
		while(true)
		{
			System.out.println("let's see your choice");
			System.out.println("1. push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			System.out.println("3. Exit");
			System.out.println("3. Display");
			System.out.println("Enter Your Choice : ");
			n = Integer.parseInt(br.readLine())
			switch(n)
			{
				case 1: System.out.println("Enter a Number to push Stack : ");
						s.push(Integer.parseInt(br.readLine()));
						break;
						
				case 2: System.out.println("Enter a Number to pop Stack : "+s.pop());
						break;
			    
				case 3: System.out.println("Display Element : ");
						s.print();
						break;
				case 4: System.out.println("The End..! ");
						break;
				default : System.out.println("Invalid Choice..! ");
						return;
			}
		}
	}
}
public class stack
{
	int []stk = new int[100];
	int top;
	Stack()
	{
		top = -1;
	}
	
}	
		
		