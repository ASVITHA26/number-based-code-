import java.util.*;
class Main{
static int fun(int n)
{
    if(n<=1)
    return n;
    return fun(n-1)+fun(n-2);
}
public static void main(String[]args)
{
    int n;
    Scanner obj=new Scanner(System.in);
    n=obj.nextInt();
    System.out.print(fun(n));
}
}
