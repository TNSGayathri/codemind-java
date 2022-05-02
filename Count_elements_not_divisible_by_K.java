import java.util.Scanner;
class Array{
    public static void main(String args[])
    {
        int n,k,i,co=0;
        int arr[]=new int[100];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
         if(arr[i]%k!=0)
         {
           co++;  
         }
        }
        System.out.println(co);
    }
}