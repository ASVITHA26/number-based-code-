import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        n=sc.nextInt();
        int temp=n;
        while(n!=0)
        {
            sum=sum+n%10;
            n=n/10;
        }
        if(temp%sum==0)
        System.out.print("");
        else
        System.out.print("Not a Harshad number");
    }
}


