import java.util.*;
class MatrixApp{
	 public static void main(String args[])
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a row and column");
		int r=sc.nextInt();//3
		int c=sc.nextInt();//3
		int a[][]=new int[r][c];
		System.out.println("Enter a array element");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Display Original Array");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		/*for(int i=0;i<r;i++)
		{
			for(int j=a[i].length-1;j>=0;j--)
			{
			System.out.print(a[j][i]+" ");
			}
			System.out.println(" ");
		} */
		
		System.out.println(" Transpose of matrix");
		/*
		1 2 3 | 7 4 1
		4 5 6
		7 8 9 
		-----
		7 4 1
		8 5 2
		9 6 3
		*/
		// transpose matrix
		for(int i=0;i<r;i++)
		{
			for(int j=i;j<r;j++)
			{
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
			
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r;j++)
			{
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r/2;j++)
			{ 1
				int temp=a[i][j];
				a[i][j]=a[i][r-j-1];
				a[i][r-j-1]=temp;
			}
			
		}
		
		
		System.out.println("Display After Roteting Array");
		
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r;j++)
			{
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	 }
}