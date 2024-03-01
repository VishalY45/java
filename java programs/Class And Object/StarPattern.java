public class StarPattern{
public static void main(String args[])
{
int i,j,p=2,q=2;
int k=0;
for( i=1;i<=7;i++)
{
if (i<=4)
{
 k=i;
  q++;
 }
 else if(i>4)
 {
  k=i-p;
  ++p;
  ++p;
  //System.out.printf("pp%d",p);
  q--;
 }
for( j=1;j<=k;j++)
{
System.out.printf("%d",q);
}
System.out.printf("\n");
}
}
}

  