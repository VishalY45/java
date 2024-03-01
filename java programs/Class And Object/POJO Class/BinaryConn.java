/*WAP to create class name as FindBinaryAlternate Digit 
void setNum(int num): this function can accept number as parameter 
boolean checkDigit(): this function return true if binary alternate digit found otherwise return false

Example:
 Enter number : 5   -   0101  - output: true 
 Enter number  7 :      0111 – output : false 
*/
import java.util.Scanner;
class Binary{
	private int no;
	private boolean flag=true;
	public void setNo(int no)
	{
		this.no=no;
	}
	public boolean checkDigit()
	{
		int a[]=new int[10];
		int a2[]=new int[10];
		int i,count=0;
		int j=0;
		for( i=0;no>0;i++)
		{
			a[i]=no%2;
			no=no/2;
		}
		System.out.println("Print Binary No");
		for( i=i-1;i>=0;i--)
		{
			count++;
			System.out.print(+a[i]);
			a2[j]=a[i];
			j++;
		}
		System.out.print("\n");
		boolean flag=true;
		for(i=0;i<count;i++)
		{
			if(a[i]!=a2[i])
			{
				flag=false;
				break;
			}
		}
			return flag;
	}
}
public class BinaryConn{
	public static void main(String aa[])
	{
       
Scanner sc=new Scanner (System.in);
  System.out.println("Enter a no");
   int no=sc.nextInt();
   Binary b1=new Binary();
  b1.setNo(no);
  boolean res=b1.checkDigit();
  if(res)
          {
             System.out.println("Binary Alternative Found");
           }
           else
      {
        	System.out.println("Binary Alternative Not Found");
         }
	}
}