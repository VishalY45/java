

import java.util.Scanner;

/*
 *  Write a program to demonstrate user defined exception for
case 1: To check Voter Eligibility.
case 2: Employee Eligibility.
case 3: If Number is Odd.
case 4: If Numbers are duplicate in array.
case 5: If String does not contain Vowels.
 */
class VoterEligibility extends Exception
{
	public  VoterEligibility()
	{
		System.out.println("Not eligible to vote. Minimum age required: 18");
	}
}
class Eligibility extends Exception
{
	public  Eligibility()
	{
		System.out.println("Not eligible to be an employee. Minimum experience required: 2 years");
	}
}
class NumberOdd extends Exception
{
	public  NumberOdd()
	{
		System.out.println("Number is odd.");
	}
}
class DuplicateNumber extends Exception
{
	public  DuplicateNumber()
	{
		System.out.println("ArrayContain Duploicate Number");
	}
}
class VowelsNotContain extends Exception
{
	public  VowelsNotContain()
	{
		System.out.println("String  conatin vowels");
	}
}
class Check
{
	public void checkAge(int age)throws VoterEligibility
	{
		if(age<=18)
		{
			throw new VoterEligibility();
		}
		else
		{
			System.out.println("Eligible");
		}
	}
	public void checkEmployee(int ex)throws Eligibility
	{
		if(ex<2)
		{
			throw new Eligibility();
		}
		else
		{
			System.out.println("Employee have experiance");
		}
	}
	public void checkodd(int no)throws NumberOdd
	{
		if(no%2==1)
		{
			throw new NumberOdd();
		}
		else
		{
			System.out.println("no is Even");
		}
	}
	public void checkduplicate(int a[])throws DuplicateNumber
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					throw new DuplicateNumber();
				}
			}
		}
	}
	public void checkVoewls(String str)throws VowelsNotContain
	{
		char ch[]=str.toCharArray();
		boolean hasvowel=false;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='O'||ch[i]=='U'||ch[i]=='I')
			{
				    hasvowel = true;
		            break; 
			}
		}
		if(hasvowel==true)
		{
			throw new VowelsNotContain();
		}
		else
		{
			System.out.println("There no Vowels");
		}
		
	}
}
public class UserExceptionApp {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner (System.in);
		Check c1=new Check();
		do
		{
			try {
			System.out.println("1:For Student age");
			System.out.println("2:for Employee");
			System.out.println("3:for Odd number");
			System.out.println("4:for ArrayDuplicate");
			System.out.println("5:for Vowel");
			System.out.println("Enter choic1");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter age");
				int age=sc.nextInt();
				sc.nextLine();
				c1.checkAge(age);
				break;
			case 2:
				System.out.println("Enter ex");
				int ex=sc.nextInt();
				c1.checkEmployee(ex);
				break;
			case 3:
				System.out.println("Enter no");
				int no=sc.nextInt();
				c1.checkodd(no);
				break;
			case 4:
				System.out.println("Enter array element");
				int a[]=new int[5];
				for(int i=0;i<a.length;i++)
				{
					a[i]=sc.nextInt();
				}
				c1.checkduplicate(a);
			
				break;
			case 5:
				sc.nextLine();
				System.out.println("Enter string");
				String str=sc.nextLine();
				
				c1.checkVoewls(str);
				
				break;	
			}
			}
			catch(Exception ex)
			{
				System.out.println("Error is"+ex);
			}
		}while(true);
	}
}
