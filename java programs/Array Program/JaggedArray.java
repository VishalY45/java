import java.util.Scanner;
public class JaggedArray{
	public static void main(String ss[])
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.printf("Enter a Row size");
		int row=sc.nextInt();
		int a[][]=new int [row][];
		int k=1;
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("\n Enter a Size of %d column:=",k);
			k++;
			int no=sc.nextInt();
			 a[i]=new int[no];
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("\nEnter a Column %d Element\n",i+1);
		   for(int j=0;j<a[i].length;j++)
		   {
               a[i][j]=sc.nextInt();
		   }
		}		
        System.out.printf("\n=========================================\n");	
        
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
		