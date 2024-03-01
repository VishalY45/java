class Abc{
       Abc()
	   {
	   this(5);
	   System.out.printf("I am Frist Method");
	   }
	   Abc(int x)
	   {
	     this(3.3f);
	   System.out.println("I am Second Method"+x);
	   }
	   Abc(float y)
	   {
	   System.out.printf("I am Third Constrictr"+y);
	   }
	   }
	   public class ThisKey{
	   public static void main(String aa[])
	   {
	    Abc c=new Abc();
		}
		}