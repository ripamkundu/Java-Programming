class Godown
{
    String item;
    double qty, rate, amt;
    Godown(String a, double b, double c)
    {
        item = a;
        qty = b;
        rate = c;
        amt = qty * rate;
    }
    void display()
    {
        System.out.println("Name Of the Item : "+item);
        System.out.println("Quantity : "+qty);
        System.out.println("Rate Of the Item : "+rate);
        System.out.println("Total Price : "+amt);   
    }
}
class Update extends Godown
{
    int pur_qty;
	double pur_rate;
    Update(String a, double b, double c, double r, int p)
    {
        super(a,b,c);
        pur_qty = p;
        pur_rate = r;
    }
    void update()
    {
        qty = qty + pur_qty;
        if(pur_rate != rate)
        {
            rate = pur_rate;
			amt = qty * rate;
        }   
    }
    void display()
    {
        System.out.println("Before Update : ");
        super.display();
		update();
        System.out.println("After Update : ");
        super.display();
        System.out.println("Name Of the Item : "+item);
        System.out.println("Quantity : "+qty);
        System.out.println("Rate Of the Item : "+rate);
        System.out.println("Total Price : "+amt);   
    }
}
public class Stock
{
    public static void main(String[] arg) 
    {
        Update ob = new Update(s, 3, 45, 10, 15);
		ob.display();
    }
}
