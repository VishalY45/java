import java.util.Scanner;
public class StrUpr{
public static void main(String s[])
{
Scanner sc=new Scanner (System.in);
System.out.printf("Enter a string");
String name=sc.nextLine();
for(int i=0;i<6;i++)
{
	char ch=name[i];
if(ch>='a'&&ch<='z')
{
ch=(char)(ch-32);
}
}
System.out.printf("Result String");
System.out.printf("\n%s",name);
}
}