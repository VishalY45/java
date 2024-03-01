import java.util.*;
class AddAmount
{
	private double amount;
	AddAmount()
	{
		this.amount=50;
	}
	AddAmount(double x)
	{
		this.amount=50+x;
	}
	public double getAmount()
	{
		return amount;
	}
}
public class AmountApp {

	public static void main(String[] args) {
		AddAmount a=new AddAmount();
		AddAmount s1=new AddAmount(20.5f);
		System.out.println("Piggy Bank 1st :"+a.getAmount()+"$");
		System.out.println("Piggy Bank 2St :"+s1.getAmount()+"$");

	}

}
