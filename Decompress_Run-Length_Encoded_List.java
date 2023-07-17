import java.util.Scanner;
public class Gaya3
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n,i,j=0;
    n=sc.nextInt();
    int a[]=new int[n];
    int b[]=new int[100];
    for (i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    for(i=1;i<n;i+=2)
    {
        int c=0;
        while(c<a[i-1])
        {
            b[j]=a[i];
            c+=1;
            j+=1;
        }
    }
    int k=j;
    for(j=0;j<k;j++)
    {
        System.out.print(b[j]+" ");
    }
}
}