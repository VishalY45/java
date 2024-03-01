import java.util.*;
public class Merging
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.printf("Enter a array");
int a[]=new int[3];
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.printf("\nDisplay Array\n");
for(int i=0;i<a.length;i++)
{
System.out.printf("%d\t",a[i]);
}
System.out.printf("Enter a array");
int a1[]=new int[3];
for(int i=0;i<a1.length;i++)
{
a1[i]=sc.nextInt();
}
System.out.printf("\nDisplay Array\n");
for(int i=0;i<a1.length;i++)
{
System.out.printf("%d\t",a1[i]);
}
//a2.length=a.length+a1.length;
int k=0;
int a3[]=new int[6];
for(int i=0;i<a.length;i++)
{
 a3[k]=a[i];
 k++;
}
for(int i=0;i<a1.length;i++)
{
 a3[k]=a1[i];
 k++;
}
for(int i=0;i<a3.length;i++)
{
for(int j=i+1;j<a3.length;j++)
{
if(a3[i]<a3[j])
{
int temp=a3[i];
a3[i]=a3[j];
a3[j]=temp;
}
}
}
System.out.printf("\nDisplay Array\n");
for(int i=0;i<a3.length;i++)
{
System.out.printf("%d\t",a3[i]);
}
}
}

