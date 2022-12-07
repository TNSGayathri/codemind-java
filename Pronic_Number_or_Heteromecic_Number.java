import java.util.Scanner;
class numb
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,f=0;
        n=sc.nextInt();
        for(i=2;i<=n;i++)
        {
            if(n%i==0 && n%(i+1)==0)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}