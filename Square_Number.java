import java.util.Scanner;
class Square
{
    public static void main(String args[])
    {
        int n,i,per=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n!=i*i)
            per=0;
            else
            {per=1;
            break;
            }
        }
        if(per==1)
        System.out.println("True");
        else
        System.out.println("False");
    }
}