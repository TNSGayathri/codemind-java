import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,e=0,o=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for (i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            e+=1;
            else
            o+=1;
        }
        System.out.print(e+" "+o);
    }
}