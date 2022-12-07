import java.util.Scanner;
class Numb
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      int n,i,s=1;
      n=sc.nextInt();
      for (i=2;i<n/2+1;i++)
      {
          if(n%i==0)
          {
            s+=i;  
          }
      }
      if(s>n)
      System.out.println("True");
      else
      System.out.println("False");
  }
}