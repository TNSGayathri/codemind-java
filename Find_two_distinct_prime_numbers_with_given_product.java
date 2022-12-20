import java.util.*;
import java.lang.*;
class sum
{
    public int res(int n)
    {
        int f=0,i;
        if(n==1)
        f=1;
        for(i=2;i<n/2;i++)
        {
            if(n%i==0)
            f=1;
            break;
        }
        return f;
    }
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int n,i,k=0,a=0,b=0;
     n=sc.nextInt();
     sum p=new sum();
     for (i=2;i<n;i++)
     {
         if(n%i==0)
         {
             if(p.res(i)==0 && p.res(n/i)==0)
             {
             a=i;
              b=n/i;
             k=1;
             }
         }
     }
     if(k==0)
     System.out.println("-1");
     else
     System.out.print(b+" "+a);
    }
}