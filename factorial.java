import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n,fact=1,i;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    for(i=1;i<=n;i++)
	    fact*=i;
	    System.out.print(fact);
	    }
}