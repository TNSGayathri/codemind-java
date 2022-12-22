import java.util.*;
import java.lang.*;
class Number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d,r,f=0;
        n=sc.nextInt();
        d=(int)Math.log10(n);
        while(n>0)
        {
            r=n/(int)(Math.pow(10,d));
            if(r==6&& f==0)
            {
                r=9;
                f=1;
            }
            System.out.print(r);
            n=n%(int)(Math.pow(10,d));
            d-=1;
        }
    }
}