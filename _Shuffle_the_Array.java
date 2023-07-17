import java.util.Scanner;
public class Gaya3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
           a[i]=sc.nextInt(); 
        }
        int k=sc.nextInt();
        int b[]=new int[n/2];
        int c[]=new int[n/2];
        for(i=0;i<k;i++)
        {
           b[i]=a[i];
        }
        j=k;
        for(i=0;i<k;i++)
        {
            c[i]=a[j];
            j+=1;
        }
        for(i=0;i<k;i++)
        {
            System.out.print(b[i]+" "+c[i]+" ");
        }
    }
}
