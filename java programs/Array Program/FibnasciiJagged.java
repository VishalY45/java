import java.util.Scanner;
public class FibnasciiJagged{
	public static void main(String ss[])
	{
		Scanner sc=new Scanner (System.in);
		int no=0,no2=1,temp;
		int a[][]=new int[4][];
		//a[0]=no2;
		a[0]=new int[4];
		a[1]=new int[2];
		a[2]=new int[4];
		a[3]=new int[3];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			temp=no+no2;
			a[i][j]=temp;
			System.out.printf("%d\t",temp);
			no=no2;
			no2=temp;
			}
		}
		
		System.out.printf("\n Display Arry\n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
				System.out.printf("%d\t",a[i][j]);
			
			System.out.printf("\n");
		}
		System.out.printf("\n=========Display Result============\n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
				System.out.printf("%d\t",a[i][j]);
			
			System.out.printf("\n");
		}
	}
}