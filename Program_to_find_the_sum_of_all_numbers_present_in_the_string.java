import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        String s;
        int c=0,a,i;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        for(i=0;i<s.length();i++)
        {
            a=s.charAt(i);
            if(a>=48 && a<=57)
            {
                c+=(a-48);
            }
        }
        System.out.println(c);
    }
}