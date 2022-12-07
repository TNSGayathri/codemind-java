import java.util.Scanner;
class numb
{
    public int prime(int n)
    {
        int f=0,i;
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                f=1;
                break;
            }
        }
        return f;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,rev=0,r,a;
        n=sc.nextInt();
        a=n;
        numb p=new numb();
        while(a>0)
        {
            r=a%10;
            rev=rev*10+r;
            a=a/10;
        }
        if(p.prime(n)==0)
        {
            if(p.prime(rev)==0)
            System.out.println("circular prime");
            else
            System.out.println("prime but not a circular prime");
        }
        else
        System.out.println("not prime");
    }
}