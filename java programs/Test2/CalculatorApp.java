import java.util.*;

abstract class Value
{
	int a;
	int b;
	public void setValue(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public abstract int perfromCal();

}
class Addition extends Value
{
	public int perfromCal()
	{
		return a+b;
	}
}
class Sub extends Value
{
	public int perfromCal()
	{
		return a-b;
	}
}
class Multi extends Value
{
	public int perfromCal()
	{
		return a*b;
	}
}
class Division extends Value
{
	public int perfromCal()
	{
		return a/b;
	}
}
class Calculator{
	public void perfromOpe(Value v)
	{
		int result=v.perfromCal();
		System.out.println("The Calculation is :"+result);
	}
}
	
class CalculatorApp{
	 public static void main(String args[])
	 {
		 Calculator c1=new Calculator();
		 Value v=new Addition();
		 v.setValue(5,4);
		 c1.perfromOpe(v);
		 v=new Sub();
		 v.setValue(4,3);
		 c1.perfromOpe(v);
		  v=new Multi();
		 v.setValue(4,3);
		 c1.perfromOpe(v);
		 v=new Division();
		 v.setValue(4,3);
		 c1.perfromOpe(v);
	 }
}