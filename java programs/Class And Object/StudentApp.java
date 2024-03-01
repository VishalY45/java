import java.util.Scanner;
class student{
	int arr[];//intstance variable
	int per;
	void setsubmarks(int a[])
	{
		arr=a;
	}
	void calper()
	{
		int agg=0;
		for(int i=0;i<arr.length;i++)
		{
			agg=agg+arr[i];
		}
	   per=agg/6;
	}
	void checkGredes()
	{
		if(per>=75&&per<=100)
		{
			System.out.printf("Student in Destination");
		}
		else if(per>=60&&per<75)
		{
			System.out.printf("Student in Frist Division");
		}
		else if(per>=50&&per<60)
		{
			System.out.printf("Student in Second Diviosion");
		}
		else if(per>=40&&per<=50)
		{
			System.out.printf("Student in Third Division");
		}
		else{
			System.out.printf("Student Failed");
		}
	}
}
class StudentApp
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];// Local variable
		System.out.printf("Enter a Marks");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		student s1=new student();
		s1.setsubmarks(a);
		s1.calper();
		s1.checkGredes();
	}
}