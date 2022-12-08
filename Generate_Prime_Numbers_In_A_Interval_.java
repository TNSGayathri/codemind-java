import java.util.Scanner;
class prime
{
    public int res(int n)
    {
        int i,f=0;
        if(n==1)
        {
            f=1;
        }
        for (i=2;i<n/2+1;i++)
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
        prime p=new prime();
        int n,i,m;
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=n;i<=m;i++)
        {
            if(p.res(i)==0)
            {
                System.out.println(i);
            }
        }
    }
}