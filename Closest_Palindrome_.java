import java.util.Scanner;
public class num
{
        public int pal(int n)
        {
            int r,re=0,temp=n;
            while (n>0)
            {
                r=n%10;
                re=re*10+r;
                n=n/10;
            }
            if (re==temp)
            {
            return 1;
            }
            else
            {
            return 0;
            }
        }
        public static void main(String args[])
        {
        Scanner sc=new Scanner(System.in);
        num g=new num();
        int n,i,a=0,b=0;
        n=sc.nextInt();
        for(i=n+1;i<=999999999;i++)
        {
            if (g.pal(i)==1)
            {
                a=i;
                break;
            }
        }
        for(i=n-1;i>=1;i--)
        {
            if (g.pal(i)==1)
            {
            b=i;
            break;
            }
        }
        if ((a-n)<(n-b))
        System.out.println(a);
        else if((a-n)==(n-b))
        System.out.println(b+" "+a);
        else
        System.out.println(b);
        
    }
}