import java.util.Scanner;
class Vowel
{
    public static void main(String args[])
    {
        String c;
        Scanner sc=new Scanner(System.in);
        c=sc.next();
        switch(c)
        {
            case "a":
                case"A":
                    System.out.println("Vowel");
                    break;
                    case "e":
                case"E":
                    System.out.println("Vowel");
                    break;
                    case "i":
                case"I":
                    System.out.println("Vowel");
                    break;
                    case "o":
                case"O":
                    System.out.println("Vowel");
                    break;
                    case "u":
                case"U":
                    System.out.println("Vowel");
                    break;
                    default:
                    System.out.println("Consonant");
        }
        
    }
}