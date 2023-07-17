import java.util.Scanner;
public class Gaya3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,c=0,f=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=0;
            for (j=0;j<n;j++)
            {
                if(a[i]==a[j] & i!=j)
                {
                    c+=1;
                }
            }
            if(c==0)
            {
            System.out.print(a[i]+" ");
            f+=1;
            }
        }
        if(f==0)
        System.out.println(-1);
    }
}