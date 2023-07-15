import java.util.Scanner;
import java.util.*;
public class num
{
        public int pal(int n)
        {
            int i,f=1;
            int x=(int)Math.sqrt(n);
            for(i=2;i<=x;i++)
            {
                if (n==1)
                {
                    f=0;
                    break;
                }
                if(n%i==0)
                {
                    f=0;
                    break;
                }
            }
            return f;
            
        }
        public static void main(String args[])
        {
        Scanner sc=new Scanner(System.in);
        num g=new num();
        int t,j;
        t=sc.nextInt();
        for(j=0;j<t;j++)
        {
        int n,i,a=0,b=0;
        n=sc.nextInt();
        for(i=n;i<=999999999;i++)
        {
            if (g.pal(i)==1)
            {
                a=i;
                break;
            }
        }
        for(i=n;i>=2;i--)
        {
            if (g.pal(i)==1)
            {
            b=i;
            break;
            }
        }
        if ((a-n)<(n-b))
        System.out.println(a);
        else
        System.out.println(b);
        }
    }
}