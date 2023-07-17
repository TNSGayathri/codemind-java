import java.util.Scanner;
public class Gaya3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,m=0,c=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();  
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==1)
            {
                c+=1;
            }
            else
            {
               if(m<c)
               {
                   m=c;
               }
               c=0;
            }
            if(m<c)
            {
                m=c;
            }
        }
            System.out.println(m);
        
    }
}