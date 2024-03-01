import java.util.Scanner;
class Factor{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no");
int no=sc.nextInt();
int i=1;
while(i<no)
{
	if(no%i==0)
	{
System.out.println(+i);
	}
i++;
}
}
}
