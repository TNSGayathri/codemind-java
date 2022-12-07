import java.util.Scanner;
import java.lang.Math;
class Arjun
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,i,d,s=0,r,temp;
      n=sc.nextInt();
      temp=n;
      d=(int)Math.log10(n)+1;
      while(n>0)
      {
       r=n%10;
       s=s+(int)Math.pow(r,d);
       n=n/10;
       d-=1;
      }
      if(s==temp)
      System.out.println("True");
      else
      System.out.println("False");
  }
}