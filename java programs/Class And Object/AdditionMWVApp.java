//Method With variable Argument;
import java.util.Scanner;
class Add{
int sum=0;
int x[];
void getresult(int ...x)
{
	for(int i=0;i<x.length;i++)
	{
		sum=sum+x[i];
	}
	System.out.println(+sum);
}
void setvalu(int x[])
{
	this.x=x;
	for(int i=0;i<5;i++)
	{
		System.out.println(+x[i]);
	}
}
}
 public class AdditionMWVApp{
	public static void main(String s[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Ennter a no");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Add a2=new Add();
		a2.getresult(a);
		a2.setvalu(a);
	}
}
	