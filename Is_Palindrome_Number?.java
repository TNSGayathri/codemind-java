import java.util.Scanner;
class gayi{
    public static void main(String args[]){
        int n,r,s=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int temp=n;
        while(n!=0){
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(temp==s)
            System.out.print("2");
        else
            System.out.print("1");
    }
}