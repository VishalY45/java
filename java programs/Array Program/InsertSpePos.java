import java.util.Scanner;
public class InsertSpePos{
	public static void main(String ss[])
	{
		Scanner sc=new Scanner (System.in);
		int a[]=new int[5];
		System.out.printf("Enter a Array elelment");
		
        for(int i=0;i<a.length-1;i++)
        {
          a[i]=sc.nextInt();
        }
		System.out.printf("\n Display Arry\n");
		for(int i=0;i<a.length-1;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		System.out.printf("\nEnter a index Which You Want to insert");
		int no=sc.nextInt();
		System.out.printf("\nEnter a no Which You Want to insert");
		int no1=sc.nextInt();
		for(int i=a.length-2;i>=no;i--)//2//1 2 3 4 5
		{                                 //   1 2  33  3  4  5
			a[i+1]=a[i];
		}
		a[no]=no1;
		System.out.printf("\n Display Result\n");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}

			
				
				