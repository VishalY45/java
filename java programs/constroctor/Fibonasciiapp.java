import java.util.Scanner;
class fibonascii{
	int f1,f2,f3;
	fibonascii()
	{
		f1=0;
		f2=1;
	}
	void Fib(int no)
	{
		System.out.printf("%d\t%d\t",f1,f2);
		for(int i=0;i<no;i++)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
			System.out.printf("%d\t",f3);
		}
	}
}
public class Fibonasciiapp{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter a no");
		int no=sc.nextInt();
		fibonascii f1= new fibonascii();
		f1.Fib(no);
	}
}