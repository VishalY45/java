/*Write a program in C to find transpose of a given matrix. 
Test Data :
 Input the rows and columns of the matrix : 2 2 
Input elements in the first matrix : 
element - [0],[0] : 1 
element - [0],[1] : 2 
element - [1],[0] : 3 
element - [1],[1] : 4
 Expected Output */
 import java.util.*;
class Tmatrix
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Array no");
		int a[][]=new int[2][2];
		int len=a.length;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Display Matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("Display Matrix");
		int aa[][]=new int[2][2];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)//1 2  1 3   1 3
			{                          //3 4  2  4   2 4
				aa[i][j]=a[j][i];
			}
			
		}
		System.out.println("Display Matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(aa[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}
		
		
