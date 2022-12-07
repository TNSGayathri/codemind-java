import java.util.Scanner;
class Numb
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,res=0,d;
        n=sc.nextInt();
        while(n>0)
        {
            d=n%10;
            n=n/10;
            res+=d*d;
            if(n==0 && res>9)
            {
                n=res;
                res=0;
            }
        }
        if(res==1)
        System.out.println("True");
        else
        System.out.println("False");
    }
}