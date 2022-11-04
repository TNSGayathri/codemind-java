import java.util.Scanner;
class space
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,c=0,a;
        String s;
        s=sc.nextLine();
        for (i=0;i<s.length();i++)
        {
            a=s.charAt(i);
            if(a>=97 && a<=122)
            c+=1;
        }
        System.out.println(c);
    }
}