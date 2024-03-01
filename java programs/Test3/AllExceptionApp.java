import java.util.InputMismatchException;
import java.util.Scanner;

public class AllExceptionApp {
	static int a[];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1:for Arretehematic Ex");
			System.out.println("2:for Nullpointer Ex");
			System.out.println("3:for inputmismatch Ex");
			System.out.println("4:for Arrayindexoutbounds Ex");
			System.out.println("5:for classnotfound Ex");
			System.out.println("6:for numberformat Ex");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				try
				{
					int a=10;
					int b=0;
					System.out.println(a/b);
				}
				catch(ArithmeticException ex)
				{
					System.out.println("Error is"+ex);
				}
				break;
			case 2:
				try
				{
					
					System.out.println(a[2]);
				}catch(NullPointerException ex)
				{
					System.out.println("Error is:+"+ex);
				}
				break;
			case 3:
				try {
				System.out.println("Enter no");
				int s=sc.nextInt();
				int ss=sc.nextInt();
				System.out.println(s/ss);
				}catch(Exception Ex)
				{
					System.out.println("error is"+Ex);
				}
				break;
			case 4:
				try
				{
					int a[]=new int[4];
					System.out.println(a[5]);
				}catch(ArrayIndexOutOfBoundsException ex)
				{
					System.out.println("Error is"+ex);
				}
				break;
			case 6:
				try
				{
					int aa=Integer.parseInt(null);
					System.out.println(aa);
				}catch(NumberFormatException ex)
				{
					System.out.println("Error is"+ex);
				}
				break;
				
				
			}
		}while(true);

	}

}
