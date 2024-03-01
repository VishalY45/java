// WAP to create class name as Power with two values 
  //  void setValue(int x,int y) : this function is used accept two parameter of type integer
   //int getPower(): this function is used for calculate power and return it
import java.util.Scanner;
import java.util.*;
class PowerFind
{
     int base;
	 int index;
	
	void setvalue(int x,int y)
	{
		base=x;
		index=y;
	}
	int getpower()
	{
	  int p=1,i=1;
	  while(i<=index)
	  {
		  p=base*p;
		  i++;
	  }
	  return p;
	}
}
public class Power{
	public static void main(String a[])
	{
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter a array element");
		x=sc.nextInt();
		y=sc.nextInt();
		
		PowerFind pp=new PowerFind();
		pp.setvalue(x,y);
		int r=pp.getpower();
		System.out.printf("Power is %d",r);
	}
}