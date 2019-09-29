import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int cc=0;
		int oc[] = new int[1000];
		while(n!=0)
		{
		     oc[cc] = n%8;
		    n=n/8;
		    cc++;
    } 
	
		
		for(int i=cc-1; i>=0; i--)
		{
		    System.out.print(oc[i]);
		}
		
	}
}
