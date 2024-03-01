import java.util.Scanner;
 abstract  class Value{
	 int a,b;
	 void setvalue(int x,int y)
	 {
		 a=x;
		 b=y;
	 }
	 abstract int getresult();
 }
 class add extends Value{
	 
	 int getresult()
	 {
		 return a+b;
	 }
 }
 class sub extends Value{
	 
	 int getresult()
	 {
		 return a-b;
	 }
 }
 class mul extends Value{
	 
	 int getresult()
	 {
		 return a*b;
	 }
 }
  class Calculator {
	   void mainmethod( Value m)
	   {
		   int r=m.getresult();
		   System.out.printf("Result Is %d",r);
	   }
 }
 public class CalculatorApplication{
	 public static void main(String asx[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter a no");
		 int x=sc.nextInt();
		 int y=sc.nextInt();
		 Calculator c=new Calculator();
		 Value v1=new add();
		 v1.setvalue(x,y);
		 c.mainmethod(v1);
		  v1=new sub();
		 v1.setvalue(x,y);
		 c.mainmethod(v1);
		  v1=new mul();
		 v1.setvalue(x,y);
		 c.mainmethod(v1);
	 }
 }
		 
		 
		 