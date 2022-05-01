import java.util.Scanner;
class Color
{
    public static void main(String args[])
    {
        String c;
        Scanner sc=new Scanner(System.in);
        c=sc.next() ;
        switch(c)
        {
            case "v":
                case "V":
            System.out.println("Violet");
            break;
            case "i":
                case "I":
            System.out.println("Indigo");
            break;
            case "b":
                case "B":
            System.out.println("Blue");
            break;
            case "g":
                case "G":
            System.out.println("Green");
            break;
            case "y":
                case "Y":
            System.out.println("Yellow");
            break;
case "o":
                case "O":
            System.out.println("Orange");
            break;
            case "r":
                case "R":
            System.out.println("Red");
            break;
default :
System.out .println("-1");




        }
    }
}