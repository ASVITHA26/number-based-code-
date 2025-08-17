import java.util.*;
class Main {
    public static void main(String[] args) {
        int n,f,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n/2;i++) {
            if(n%i==0) {
                f=i;
                sum=sum+f;
            }
        }
        if(n==sum) 
        System.out.print("perfect number");
        else
        System.out.print("not a perfect number");
    }
}