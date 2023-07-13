import java.util.Scanner;
public class Gaya3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        int n,m=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(m<a[i])
            {
                m=a[i];
            }
        }
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if((a[i]+k)>=m)
            {
                System.out.print("True ");
            }
            else
            System.out.print("False ");
        }
    }
}