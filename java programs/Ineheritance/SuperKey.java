class Abc{
	Abc()
	{
		System.out.println("I am parent class");
	}
}
class xyz extends Abc{
	xyz()
	{
		//super(100);
		System.out.printf("I am child class");
	}
}
public class SuperKey{
	public static void main(String aa[])
	{
		xyz x=new xyz();
	}
}
