import java.util.Scanner;
public class Employee{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a name");
String ch=sc.nextLine();
System.out.println("Enter a id");
int id=sc.nextInt();
System.out.println("Enter a sallery");
int sal=sc.nextInt();
System.out.printf("The Data\n");
System.out.printf("%s\n",ch);
System.out.printf("%d\n",id);
System.out.printf("%d\n",sal);
}
}


