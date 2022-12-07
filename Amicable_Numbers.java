import java.util.Scanner;
class numb
{
    public int sum(int n)
    {
       int i,s=1;
       for (i=2;i<=n/2;i++)
       {
           if(n%i==0)
           s+=i;
       }
       return s;
    }
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    numb nu=new numb();
    int n,m;
    n=sc.nextInt();
    m=sc.nextInt();
    if(n==nu.sum(m) && m==nu.sum(n))
    System.out.println("Amicable");
    else
    System.out.println("Not Amicable");
    }
}