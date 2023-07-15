import java.util.Scanner;
public class num
{
        public int pal(int n)
        {
            int i,f=1;
            for(i=2;i<n/2+1;i++)
            {
                if(n%i==0 || n==1)
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
        for(i=n;i>=1;i--)
        {
            if (g.pal(i)==1)
            {
            b=i;
            break;
            }
        }
        if ((a-n)<=(n-b))
        System.out.println(a-n);
        else
        System.out.println(n-b);
        
    }
}