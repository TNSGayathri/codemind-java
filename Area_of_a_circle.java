import java.util.Scanner;
class circle
{
    public static void main(String args[])
    {
        float r;
        Scanner sc =new Scanner(System.in);
        r=sc.nextFloat();
        double area;
        area =3.14*r*r;
        System.out.printf("%.2f",area);
    }
}