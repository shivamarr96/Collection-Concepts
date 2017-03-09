class Powerset
{
static void power(int x[])
{
int i,j,k;
for(i=1;i<=x.length;i++)
{
cal(i-1,x);
System.out.println("");
}
}
static void cal(int a,int x[])
{
for(int i=0;i<=x.length;i+=a)
{
System.out.print(x[i]);
}
}
static int pow(int a,int b)
{
int powerr=1;
for(int i=1;i<=b;i++)
{
powerr=powerr*a;
}
return powerr;
}
public static void main(String[] s)
{
int x[]={1,2,3};
for(int i=0;i<x.length;i++)
{
System.out.print(x[i]);
System.out.print("\t");
}
System.out.println("");
power(x);
System.out.print("No.of elements in power set");
System.out.println("="+ pow(2,x.length));
}
}
