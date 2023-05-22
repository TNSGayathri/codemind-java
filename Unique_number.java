import java.util.*;
public class number{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),flag = 0;
        Set<Integer> hs = new HashSet<>();
        while(a > 0){
            if(!hs.add(a%10)){
                System.out.println("Not Unique Number");
                flag = 1;
                break;
            }
            a = a / 10;
        }
        if(flag == 0)
            System.out.println("Unique Number");
    }
}