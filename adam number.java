import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        int n,sn,rn=0,d,srn,rsrn=0;
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();//12
        sn=n*n;//12*12=144
        while(n!=0)//0
        {
            d=n%10;//1%10=1
            rn=rn*10+d;//2*!0+1=21
            n/=10;//1/10=0
        }
        srn=rn*rn;//21*21=441 
        while(srn!=0)//0
        {
            d=srn%10;//4%10=4
            rsrn=rsrn*10+d;//14*10+4=144
            srn/=10;//4/10=0
        }
        if(rsrn==sn)
        System.out.print("Adam no");
        else
         System.out.print("Not an Adam no");
        

    }
}