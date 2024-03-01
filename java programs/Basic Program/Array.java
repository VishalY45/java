import java.util.Scanner;
 public class  Array{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no");
int aa[]=new int [5];
for(int i=0;i<5;i++)
{
  aa[i]=sc.nextInt();
}
for(int i=0;i<5;i++)
{
System.out.println(+aa[i]);
}
}
}