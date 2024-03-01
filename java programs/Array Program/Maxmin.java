import java.util.Scanner;
public class Maxmin
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.printf("Enter a array");
int a[]=new int[5];
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.printf("\nDisplay Array\n");
for(int i=0;i<a.length;i++)
{
System.out.printf("%d\t",a[i]);
}
int min=a[0];
int max=0;
for(int i=0;i<a.length;i++)
{
 if(a[i]>max)
 max=a[i];
 else if(a[i]<min)
 min=a[i];

}
System.out.printf("MAx:=%d\t",max);
System.out.printf("Min=%d\t",min);}
}
