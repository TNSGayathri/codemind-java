import java.util.Scanner;
class picture
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,a,b,l;
        l=sc.nextInt();
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            if(a>=l && b>=l )
            {
            if(a==b &&a>=l)
            System.out.println("ACCEPTED");
            else if(a>=l && b>=l)
            System.out.println("CROP IT");
            }
            else
            System.out.println("UPLOAD ANOTHER");
        }
    }
}