import java.util.*;
class CustomWrapperApp
{
	private int value;
	public CustomWrapperApp(int value)
	{
		this.value=value;
	}
	public void setValue(int value)
	{
		this.value=value;
	}
	public int getValue()
	{
		return value;
	}
}
class CustomWrapper
{
	public static void main(String args[])
	{
		CustomWrapperApp c1=new CustomWrapperApp(21);
		System.out.println("First Value :"+c1.getValue());
		c1.setValue(55);
		System.out.println("Next Value :"+c1.getValue());
	
	}
}
		