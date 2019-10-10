
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
	 
	    while(n1!=n2){
		if(n1>n2)
		 {
		   n1 = n1-n2;  
		 }
		 else
		 {
		     n2 = n2-n1;
		 }
	    }   
		 System.out.print("The GCD of given numbers is:"+n1);
	}
}
