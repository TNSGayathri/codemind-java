import java.util.*;
import java.lang.*;
class sum
{
    public int res(int n)
    {
        int i,f=0;
        if(n==1)
        f=1;
        for(i=2;i<n/2;i++)
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
        int n,m,i;
        n=sc.nextInt();
        m=sc.nextInt();
        sum p=new sum();
        for(i=(n+m)+1;i<99999;i++)
        {
            if(p.res(i)==0)
            {
                System.out.println(i-(n+m));
                break;
            }
        }
    }
}