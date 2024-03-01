import java.util.Scanner;
class sum{
	int sum=0;//intstance variable
	void calsum(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.printf("Sum is:=%d ",sum);
	}
}
	public class CalsumA{
		public static void main(String ad[])
		{
			Scanner sc=new Scanner (System.in);
			int a[]=new int[5];
			System.out.printf("Enter a sum no");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			sum s1=new sum();
			s1.calsum(a);
		}
	}		