import java.util.Scanner;
public class MinmumDistanceArray{
	public static void main(String ss[])
	{
		Scanner sc=new Scanner (System.in);
		int a[]=new int[10];
		System.out.printf("Enter a Array elelment");
		
        for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
		System.out.printf("\n Display Arry\n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		System.out.printf("Enter a no which we want find a distance");
		int no=sc.nextInt();
		int no1=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if((a[i]==no||a[i]==no1)&&(a[i]==no1||a[i]==no)
			{
				