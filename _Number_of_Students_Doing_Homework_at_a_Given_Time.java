import java.util.Scanner;
public class Gaya3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int m,j,c=0,k;
        m=sc.nextInt();
        int b[]=new int[m];
        for(j=0;j<m;j++)
        {
            b[j]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]<=k & k<=b[i])
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}