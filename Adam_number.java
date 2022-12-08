import java.util.Scanner;
class sum
{
    public int rev(int n)
    { int r,ren=0;
      while(n>0)
      {
         r=n%10;
         ren=ren*10+r;
         n=n/10;
      }
      return ren;
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,re,res;
        n=sc.nextInt();
        a=n*n;
        sum s=new sum();
        re=s.rev(n);
        res=re*re;
        if(s.rev(res)==a)
        System.out.println("True");
        else
        System.out.println("False");
    }
}