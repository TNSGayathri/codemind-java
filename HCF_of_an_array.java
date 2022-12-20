import java.util.Scanner;
class Sample
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[],n,i;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        int min=a[0],c=0;
        for(i=1;i<n;i++){
            min=min>a[i]?a[i]:min;
        }
        for(i=min;i>0;i--){
            int count=0;
            for(int j=0;j<n;j++){
                if(a[j]%i==0){
                    count++;
                }
            }
            if(count==n){
                System.out.print(i);
                break;
            }
        }
    }
}