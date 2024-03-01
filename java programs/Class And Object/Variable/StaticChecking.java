import java.util.Scanner;
class Ststic{
 static int x;
 int y;
 }
 public class StaticChecking{
	 public static void main(String aa[])
	 {
		 Ststic s=new Ststic();
		//Ststic.x=100;//access by using classname.membername
		   s.x=100;//access by using object
           int y=200;
System.out.printf("%d",s.x);
System.out.printf("%d",y);
	 }
 }	 