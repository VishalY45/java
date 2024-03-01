package Concept.org;
class Abc{
	public static void show()
	{
		System.out.println("Hello");
	}
}
class pqr extends Abc{
	public static void show()
	{
		System.out.println("Hello2");
	}
}
public class FinalKeywordApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pqr p=new pqr();
p.show();
	}

}
