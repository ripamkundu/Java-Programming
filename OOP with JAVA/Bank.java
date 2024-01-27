import java.io.*;

class account
{
	char name;
	int acc_num,acc_type, balance,amount;
	void getdata()
	{
		System.out.println("Enter Customer Name : ");
		name = br.readLine();
		
		System.out.println("Account number :");
		acc_num = Integer.parseInt(br.readLine());
		
		System.out.println("Account type....! ");
		System.out.println("1. Saving Account."); 
		System.out.println("2. Current Account");
		acc_type = Integer.parseInt(br.readLine());;
		System.out.println("Account balance:");
		balance = Integer.parseInt(br.readLine());
	}
	void display()
	{
		System.out.println(" Your Account Balance :" +balance);
	}
	
	void withdraw()
	{
		System.out.println("Enter the amount you want to withdraw :");
		amount = Integer.parseInt(br.readLine());
		if(amount>balance)
		{
			System.out.println("Insuficient balance");
		}
		else
		{
			balance = balance-amount;
			display();
		}
	}
};

class cur_acct extends account
{
	void panelty()
	{
		if(balance<200 && acc_type == 2)
		{
			balance = balance - 20;
			display();
		}
	}
};

class sav_acct extends account
{
	void interest()
	{
		int t;
		System.out.println("Enter time interval in year:");
		t = Integer.parseInt(br.readLine());
		balance=balance*(1+2*t);
		display();
	}
};
public class Bank
{
	public static void main (String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		account ac = new account();
		ac.getdata();
		ac.display();
		ac.withdraw();
	}
}