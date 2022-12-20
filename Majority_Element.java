import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=1,j;
        n=sc.nextInt();
        int a[]=new int[n];
        for (i=0;i<n;i++)
        {
           a[i]=sc.nextInt() ;
        }
        for (i=0;i<n;i++)
        {c=0;
        if(a[i]==-1)
        {
            continue;
        }
            for (j=0;j<n;j++)
            {
                if(a[i]==a[j] && i!=j)
                {
                    c+=1;
                    a[j]=-1;
                }
            }
            if(c>=n/2)
            {
                System.out.println(a[i]);
            }
        }
    }
}