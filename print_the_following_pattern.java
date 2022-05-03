import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(j);
            }
            n--;
          System.out.print("
");
        }
    }
}