import java.util.Scanner;
class Temp
{
    public static void main (String args[])
    {
        float c,f;
        Scanner sc=new Scanner (System.in);
        c=sc.nextFloat();
        f=32+(c*9/5);
        System.out.printf("%.2f",f);
    }
}