/*) Create a class named 'Rectangle' with two data members- length and breadth 
and a method to calculate the area which is 'length*breadth'. 
The class has three constructors which are : 
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters 
 - the two numbers are assigned as length and breadth respectively. 3 - having one number as 
parameter - both length and breadth are assigned that number. Now, create objects of the 
'Rectangle' class having none, one and two parameters and print their area*/
import java.util.*;
class Rectangle
{
 private int length;
 private int breadth;
 public Rectangle()
 {
	 this.length=0;
	 this.breadth=0;
 }
 public Rectangle(int len,int breadth)
 {
	 this.length=len;
	 this.breadth=breadth;
 }
 public Rectangle(int side)
 {
	 this.length=side;
	 this.breadth=side;
 }
 public int Calculate()
 {
	 return length*breadth;
 }
}
 class RectangleApp2{
	 public static void main(String args[])
	 {
		 Rectangle r1=new Rectangle();
		 System.out.println("The First :"+r1.Calculate());
		  Rectangle r2=new Rectangle(3,4);
		 System.out.println("The Second :"+r2.Calculate());
		  Rectangle r3=new Rectangle(6);
		 System.out.println("The Third :"+r3.Calculate());
	 }
 }