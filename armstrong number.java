import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        int n,temp,c=0,sum=0,d;
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();//153
        temp=n;
        while(n!=0)
        {
            n=n/10;
            c++;
        }
        n=temp;
        while(n!=0)
        {
            d=n%10;//1%10=1
            sum=sum+(int)Math.pow(d,c);//sum=153
            n=n/10;//1/10=0
        }
        if(sum==temp)
        System.out.print("Armstrong number");
        else
         System.out.print("Not ans Armstrong number");
        
        
    }
}