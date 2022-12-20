import java.util.*;
import java.lang.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n,i;
        n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for (i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            
        }
        for(i=0;i<n;i++)
        {
           b[i]=a[i]*a[i]; 
        }
       Arrays.sort(b);
       for (i=0;i<n;i++)
       {
           System.out.print(b[i]+" ");
       }
    }
}