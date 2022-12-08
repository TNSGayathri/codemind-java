import java.util.Scanner;
class prime
{
    public int sum(int n)
    {int f=0,i;
    if(n==1)
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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,k=0;
        n=sc.nextInt();
        prime p=new prime();
        if(p.sum(n)==0)
        {k=0;
          while(n>0)
          {
              r=n%10;
              if(p.sum(r)==1)
              {
                  k=1;
                  break;
              }
              n=n/10;
          }
          if(k==0)
          System.out.println("Mega Prime");
          else
          System.out.println("Not Mega Prime");
        }
        else
        System.out.println("Not Mega Prime");
    }
}