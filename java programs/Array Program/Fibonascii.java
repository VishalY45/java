import java.util.Scanner;
public class Fibonascii
{
	public static void main(String argd[])
	{
		Scanner sc=new Scanner(System.in);
		int no=0,no1=1,temp;
		int a[][]=new int [4][];
		a[0]=new int[4];
		a[1]=new int[2];
		a[2]=new int[4];
		a[3]=new int[3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				temp=no+no1;
				System.out.printf("%d\t",temp);
				a[i][j]=temp;
				no=no1;
				no1=temp;
			}
		}
		 System.out.printf("\n==================================\n");
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<a[i].length;j++)
			 {
				 System.out.printf("%d\t",a[i][j]);
			 }
			 System.out.printf("\n");
		 }
	}
}