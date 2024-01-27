import package1.currant;
import package1.*;

public class bank
{
	public static void main(String [] arg)
	{
		currant ob = new currant();
		savings ob1 = new savings();
		ob.deposit();
		ob.withdrawal();
		ob.balance();
		ob1.deposit();
		ob1.withdrawal();
		ob1.interest();
		ob1.balance();
			
	}
}
