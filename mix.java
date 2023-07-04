import java.util.*;
class mix
{
public static void main(String[] Args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter value of a=");
int a=sc.nextInt();
System.out.println("enter value of b=");
int b=sc.nextInt();
System.out.println("enter value of c=");
int c=sc.nextInt();
System.out.println("enter value of d=");
int d=sc.nextInt();
System.out.println("enter value of e=");
int e=sc.nextInt();
System.out.println("enter value of f=");
int f=sc.nextInt();
int g=a+b+c;
System.out.println("Sum of first three no="+g);
int h=d+e+f/3;
System.out.println("Avg of last three numbers="+f);
int k=g+h;
System.out.println("Addition of Sum and Avg="+k);
}
}