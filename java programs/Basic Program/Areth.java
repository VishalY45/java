import java.util.Scanner;
public class Areth{
public static void main(String aaa[])
{
Scanner sc=new Scanner(System.in);
do{
System.out.println("1:Add");
System.out.println("2:Mul");
System.out.println("3:Sub");
System.out.println("1:Add");
int choice=sc.nextInt();
switch(choice)
{
case 1:
{
System.out.println("Enter a Two no");
int a=sc.nextInt();
int b=sc.nextInt();
int sum=a+b;
System.out.println(" Sum iS"+sum);
}
break;
case 2:
{
System.out.println("Enter a Two no");
int a=sc.nextInt();
int b=sc.nextInt();
int mul=a*b;
System.out.println("Mul iS"+mul);
}
break;
case 3:
{
System.out.println("Enter a Two no");
int a=sc.nextInt();
int b=sc.nextInt();
int Sub=a-b;
System.out.println("Sub iS"+Sub);
}
break;
default:
System.out.println("Wrong Choice");
}
}while(choice<=3);
}
}

