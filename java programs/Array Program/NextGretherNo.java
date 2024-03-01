import java.util.Scanner;
public class NextGretherNo
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.printf("Enter a array");
int a[]=new int[8];
int a2[]=new int[8];
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.printf("\nDisplay Array\n");
for(int i=0;i<a.length;i++)
{
System.out.printf("%d\t",a[i]);
}

for(int i=0;i<a.length;i++)
{
 a2[i]=-1;
  for(int j=i+1;j<a.length;j++)
  {
	 
    if(a[i]<a[j])
	{
	  a2[i]=a[j];
	  break;
	  }
  }
  System.out.printf("\nNext bigger element of %d in the array is%d\n",a[i],a2[i]);
}
for(int i=0;i<a2.length;i++)
{
	System.out.printf("%d\t",a2[i]);
}
}
}