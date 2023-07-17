import java.util.Scanner;
public class Gaya3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,i,j,c;
        a=sc.nextInt();
        int m[]=new int[a];
        for (i=0;i<a;i++)
        {
            m[i]=sc.nextInt();
        }
        for (j=1;j<=a+1;j++)
        {
            c=0;
            for (i=0;i<a;i++)
            {
                if (j==m[i])
                {
                    c=1;
                    break;
                }
            }
            if(c==0)
            {
                System.out.println(j);
                break;
            }
            
        }
    }
}