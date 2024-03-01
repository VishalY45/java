import java.util.*;
class FreNo2
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int no=sc.nextInt();
		int temp=no;
		int rev=0;
		
		while(no!=0)
		{
			int rem=no%10;
			no=no/10;
			rev=rev*10+rem;
		}
		no=rev;
		while(no!=0)
		{
			int rem=no%10;
			switch(rem)
			{
				case 0:
				System.out.println("Zero");
				break;
				case 1:
				System.out.print("One");
				break;
				case 2:
				System.out.print("Two");
				break;
				case 3:
				System.out.print("Three");
				break;
				case 4:
				System.out.print("Four");
				break;
				case 5:
				System.out.print("Five");
				break;
				case 6:
				System.out.print("Six");
				break;
				case 7:
				System.out.print("Seven");
				break;
				case 8:
				System.out.print("Eight");
				break;
				case 9:
				System.out.print("Nine");
				break;
				default:
				
				System.out.println("wrong");
			}
			no=no/10;
		}while(no>=0);
	}
}

				
				
				
				
			