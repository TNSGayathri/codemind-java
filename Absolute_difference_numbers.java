import java.util.*;
import java.lang.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x,d,diff=0;
        n=sc.nextInt();
        x=sc.nextInt();
        d=(int)Math.log10(n)+1;
        int a=n%(int)Math.pow(10,x);
        int b=n/(int)(Math.pow(10,(d-x)));
        System.out.println(Math.abs(a-b));
    }
}