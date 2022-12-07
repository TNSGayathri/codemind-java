import java.util.Scanner;
class Numb
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n,i,f=0;
        n=sc.nextInt();
        for (i=2;i<n/2+1;i++)
        {if(i==1)
        f=1;
            if(n%i==0)
            {
                f=1;
                break;
            }
        }
        if(f==0)
        System.out.println("prime");
        else
        System.out.println("not a prime");
    }
}