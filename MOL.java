/*Method Over Loading*/
public class MOL{
public static void main(String[]Args)
{
int res;
System.out.println("Hi");
res=met1(10,20);
System.out.println("The sum is "+res);
res=met1(10,20,30);
System.out.println("The sum is "+res);
}
static int met1(int x,int y)
{
int sum;
sum=x+y;
System.out.println("X value is"+x);
System.out.println("y value is"+y);
return sum;
}
static int met1(int x,int y,int z)
{
int sum=x+y+z;
System.out.println("The sum is "+sum);
return sum;
}
}