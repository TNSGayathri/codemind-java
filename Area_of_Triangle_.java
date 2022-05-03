import java.util.Scanner;
class Area
{
    public static void main(String args[]){
        float a,b,c,s;
        double area;
        Scanner sc=new Scanner(System.in);
       a =sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       s=(a+b+c)/2;
       area=Math.sqrt (s*(s-a)*(s-b)*(s-c));
       System.out.printf("%.2f",area);
    }
}