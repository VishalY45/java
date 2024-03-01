import java.util.Scanner;
 class thiss{
     thiss()
	 {this(5);
		 System.out.printf(" I am vishal");
	 }
	 thiss(int a)
	 {this(5.5f);
		 System.out.printf(" I am vishal %d",a);
	 }
	 thiss(float b)
	 {
		 System.out.printf(" I am vishal %f",b);
	 }
 }
 public class thisCons{
	 public static void main(String aa[])
	 {
		 thiss t=new thiss();
	 }
 }