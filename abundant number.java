import java.util.*;
class Main{
    public static void main(String[] args){
        int n;
        int sum=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n/2;i++) {
            if(n%i==0) {
                sum=sum+n;
            }
        }
         if (sum>n) {
            System.out.println("abundant");
        } else {
            System.out.println("Not abundant number");
        }
    }
}