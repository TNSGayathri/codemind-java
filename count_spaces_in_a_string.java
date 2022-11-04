import java.util.Scanner;
class Space
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int c=0,i;
        s=sc.nextLine();
        for (i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            c+=1;
        }
        System.out.println(c);
    }
}