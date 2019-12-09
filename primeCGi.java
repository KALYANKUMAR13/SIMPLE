
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lower = scan.nextInt();
		int upper = scan.nextInt();
		int add=0;
		int l1=0,l2=0;
	    if(isprime(lower) && isprime(upper)==true)
	    {
	       add = lower + upper;
	       System.out.println(add);
	    }
	    
	    else 
	    {
	        int m = lower;
	        while(m>=2)
	        {
	            if(isprime(m))
	            {
	                l1=m;
	                break;
	            }
	            else
	             m++;
	        }
	        
	         int m2 = upper;
	        while(m2>2)
	        {
	            if(isprime(m2))
	            {
	                l2=m2;
	                break;
	            }
	            else
	             m2--;
	        }
	        add = l1+l2;
	        System.out.println(add);
	    }
	}
	public static boolean isprime(int n)
	{
	    int count=0;
	    for(int i=1;i<=n;i++)
	    {
	        if(n%i==0) 
	         count++;
	    }
	    if(count == 2)
	     return true;
	    else
	     return false;
	}
}
