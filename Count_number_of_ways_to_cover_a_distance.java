import java.util.Scanner;
class sum
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int n,i,r=0,a=1,b=1,c=2,temp;
       n=sc.nextInt();
       if(n<=2)
       System.out.println(n);
       else
       {
          for(i=3;i<n+1;i++)
          {
              r=a+b+c;
              temp=a;
              a=b;
              b=c;
              c=r;
          }
              System.out.println(r);
       }
   }
}