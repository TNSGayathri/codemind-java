import java.util.Scanner;
class prime
{
    public int sum(int n)
    {int f=0,i;
    if (n==1)
    f=1;
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
    public int res(int n)
    {
        int r,re=0,temp,k=0;
        temp=n;
        while(n>0)
        {
            r=n%10;
            re=re*10+r;
            n=n/10;
        }
        if(temp==re)
        {
            k=1;
        }
        return k;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        prime p=new prime();
        for(i=n+1;;i++)
        {
            if(p.sum(i)==0 && p.res(i)==1 )
            {
                System.out.println(i);
                break;
            }
        }
    }
}